package com.alorma.github.ui.adapter.issues;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.alorma.github.sdk.bean.dto.response.Issue;
import com.alorma.github.sdk.bean.dto.response.Permissions;
import com.alorma.github.sdk.bean.info.RepoInfo;
import com.alorma.github.sdk.bean.issue.Story;
import com.alorma.github.ui.adapter.issues.holders.Holder;
import com.alorma.github.ui.adapter.issues.holders.IssueHolder;
import com.alorma.github.ui.listeners.IssueCommentRequestListener;
import com.alorma.github.ui.listeners.IssueDetailRequestListener;
import com.alorma.github.ui.view.issue.IssueDetailView;

public class IssueDetailAdapter extends StoryDetailAdapter<Issue> {

  public IssueDetailAdapter(Context context, RecyclerView recyclerView, LayoutInflater inflater, Story<Issue> story, RepoInfo repoInfo,
      IssueDetailRequestListener issueDetailRequestListener, IssueCommentRequestListener issueCommentRequestListener) {
    super(context, recyclerView, inflater, story, repoInfo, issueDetailRequestListener, issueCommentRequestListener);
  }

  @Override
  protected Holder<Issue> createItemHolder(Context context, ViewGroup.LayoutParams params, Story<Issue> story, Permissions permissions,
      IssueDetailRequestListener issueDetailRequestListener) {
    IssueDetailView issueDetailView = new IssueDetailView(context);
    issueDetailView.setLayoutParams(params);
    return new IssueHolder(issueDetailView, issueDetailRequestListener);
  }
}
