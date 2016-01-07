package com.alorma.github.sdk.services.orgs;

import android.content.Context;
import com.alorma.github.sdk.services.repos.GithubReposClient;
import com.alorma.github.sdk.services.repos.ReposService;

public class OrgsReposClient extends GithubReposClient {

  public OrgsReposClient(Context context) {
    super(context);
  }

  public OrgsReposClient(Context context, String username, String sort) {
    super(context, username, sort);
  }

  public OrgsReposClient(Context context, String username, String sort, int page) {
    super(context, username, sort, page);
  }

  @Override
  protected void executeUserFirstPage(String sort, ReposService usersService, ApiSubscriber apiSubscriber) {

  }

  @Override
  protected void executeFirstPageByUsername(String org, String sort, ReposService orgsService, ApiSubscriber apiSubscriber) {
    orgsService.orgsReposList(org, sort, apiSubscriber);
  }

  @Override
  protected void executeUserPaginated(int page, String sort, ReposService usersService, ApiSubscriber apiSubscriber) {

  }

  @Override
  protected void executePaginatedByUsername(String org, int page, String sort, ReposService orgsService, ApiSubscriber apiSubscriber) {
    orgsService.orgsReposList(org, page, sort, apiSubscriber);
  }
}
