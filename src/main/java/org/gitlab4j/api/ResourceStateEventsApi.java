package org.gitlab4j.api;

import java.util.List;
import java.util.stream.Stream;

import org.gitlab4j.api.models.IssueEvent;
import org.gitlab4j.api.models.MergeRequestStateEvent;


/**
 * This class provides an entry point to all the GitLab Resource state events API
 * @see <a href="https://docs.gitlab.com/ce/api/resource_state_events.html">Resource state events API at GitLab</a>
 */
public class ResourceStateEventsApi extends AbstractApi {

    public ResourceStateEventsApi(GitLabApi gitLabApi) {
        super(gitLabApi);
    }

    /**
     * Gets a list of all state events for a single issue.
     *
     * <pre><code>GitLab Endpoint: GET /projects/:id/issues/:issue_iid/resource_state_events</code></pre>
     *
     * @param projectIdOrPath id, path of the project, or a Project instance holding the project ID or path
     * @param issueIid the IID of the issue
     * @return a List of IssueEvent for the specified issue
     * @throws GitLabApiException if any exception occurs
     */
    public List<IssueEvent> getIssueStateEvents(Object projectIdOrPath, Long issueIid) throws GitLabApiException {
        return (getIssueStateEvents(projectIdOrPath, issueIid, getDefaultPerPage()).all());
    }

    /**
     * Gets a Pager of all state events for a single issue.
     *
     * <pre><code>GitLab Endpoint: GET /projects/:id/issues/:issue_iid/resource_state_events</code></pre>
     *
     * @param projectIdOrPath id, path of the project, or a Project instance holding the project ID or path
     * @param issueIid the IID of the issue
     * @param itemsPerPage the number of LabelEvent instances that will be fetched per page
     * @return the Pager of IssueEvent instances for the specified issue IID
     * @throws GitLabApiException if any exception occurs
     */
    public Pager<IssueEvent> getIssueStateEvents(Object projectIdOrPath, Long issueIid, int itemsPerPage) throws GitLabApiException {
        return (new Pager<>(this, IssueEvent.class, itemsPerPage, null,
            "projects", getProjectIdOrPath(projectIdOrPath), "issues", issueIid, "resource_state_events"));
    }

    /**
     * Gets a Stream of all state events for a single issue.
     *
     * <pre><code>GitLab Endpoint: GET /projects/:id/issues/:issue_iid/resource_state_events</code></pre>
     *
     * @param projectIdOrPath id, path of the project, or a Project instance holding the project ID or path
     * @param issueIid the IID of the issue
     * @return a Stream of IssueEvent for the specified issue
     * @throws GitLabApiException if any exception occurs
     */
    public Stream<IssueEvent> getIssueStateEventsStream(Object projectIdOrPath, Long issueIid) throws GitLabApiException {
        return (getIssueStateEvents(projectIdOrPath, issueIid, getDefaultPerPage()).stream());
    }

    /**
     * Gets a list of all state events for a single merge request.
     *
     * <pre><code>GitLab Endpoint: GET /projects/:id/merge_request_iid/resource_state_events</code></pre>
     *
     * @param projectIdOrPath id, path of the project, or a Project instance holding the project ID or path
     * @param mergeRequestIid the IID of the merge request
     * @return a List of MergeRequestStateEvent for the specified merge request
     * @throws GitLabApiException if any exception occurs
     */
    public List<MergeRequestStateEvent> getMergeRequestStateEvents(Object projectIdOrPath, Long mergeRequestIid) throws GitLabApiException {
        return (getMergeRequestStateEvents(projectIdOrPath, mergeRequestIid, getDefaultPerPage()).all());
    }

    /**
     * Gets a Pager of all state events for a single merge request.
     *
     * <pre><code>GitLab Endpoint: GET /projects/:id/merge_requests/merge_request_iid/resource_state_events</code></pre>
     *
     * @param projectIdOrPath id, path of the project, or a Project instance holding the project ID or path
     * @param mergeRequestIid the IID of the merge request
     * @param itemsPerPage the number of LabelEvent instances that will be fetched per page
     * @return the Pager of MergeRequestStateEvent instances for the specified merge request IID
     * @throws GitLabApiException if any exception occurs
     */
    public Pager<MergeRequestStateEvent> getMergeRequestStateEvents(Object projectIdOrPath, Long mergeRequestIid, int itemsPerPage) throws GitLabApiException {
        return (new Pager<>(this, MergeRequestStateEvent.class, itemsPerPage, null,
            "projects", getProjectIdOrPath(projectIdOrPath), "merge_requests", mergeRequestIid, "resource_state_events"));
    }

    /**
     * Gets a Stream of all state events for a single merge request.
     *
     * <pre><code>GitLab Endpoint: GET /projects/:id/merge_requests/merge_request_iid/resource_state_events</code></pre>
     *
     * @param projectIdOrPath id, path of the project, or a Project instance holding the project ID or path
     * @param mergeRequestIid the IID of the merge request
     * @return a Stream of MergeRequestStateEvent for the specified merge request
     * @throws GitLabApiException if any exception occurs
     */
    public Stream<MergeRequestStateEvent> getMergeRequestStateEventsStream(Object projectIdOrPath, Long mergeRequestIid) throws GitLabApiException {
        return (getMergeRequestStateEvents(projectIdOrPath, mergeRequestIid, getDefaultPerPage()).stream());
    }
}
