package javaposse.jobdsl.dsl.helpers.publisher

import javaposse.jobdsl.dsl.helpers.Context

class SlackContext implements Context {
    boolean notifyBuildStart = false
    boolean notifyAborted = false
    boolean notifyFailure = false
    boolean notifyNotBuilt = false
    boolean notifySuccess = false
    boolean notifyUnstable = false
    boolean notifyBackToNormal = false

    String teamDomain
    String integrationToken
    String buildServerUrl
    String channel

    void setChannel(String channel) {
        this.channel = channel
    }

    void setNotifyBuildStart(boolean notifyBuildStart) {
        this.notifyBuildStart = notifyBuildStart
    }

    void setNotifyAborted(boolean notifyAborted) {
        this.notifyAborted = notifyAborted
    }

    void setNotifyFailure(boolean notifyFailure) {
        this.notifyFailure = notifyFailure
    }

    void setNotifyNotBuilt(boolean notifyNotBuilt) {
        this.notifyNotBuilt = notifyNotBuilt
    }

    void setNotifySuccess(boolean notifySuccess) {
        this.notifySuccess = notifySuccess
    }

    void setNotifyUnstable(boolean notifyUnstable) {
        this.notifyUnstable = notifyUnstable
    }

    void setNotifyBackToNormal(boolean notifyBackToNormal) {
        this.notifyBackToNormal = notifyBackToNormal
    }

    void setTeamDomain(String teamDomain) {
        this.teamDomain = teamDomain
    }

    void setIntegrationToken(String integrationToken) {
        this.integrationToken = integrationToken
    }

    void setBuildServerUrl(String buildServerUrl) {
        this.buildServerUrl = buildServerUrl
    }
}
