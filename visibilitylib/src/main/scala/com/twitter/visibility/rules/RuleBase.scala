// 
//             ඞ ELON SUS ඞ
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀
// ⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀
// ⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀
// ⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀
// ⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀
// ⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀
// ⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀
// ⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀
// ⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀
// ⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀
// ⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// 
package com.twitter.visibility.rules

import com.twitter.visibility.features.AuthorScreenName
import com.twitter.visibility.features.Feature
import com.twitter.visibility.features.FeatureMap
import com.twitter.visibility.features.RawQuery
import com.twitter.visibility.models.SafetyLevel
import com.twitter.visibility.models.SafetyLevel._

object RuleBase {

  val DeprecatedFeatures: Seq[Feature[_]] =
    Seq(AuthorScreenName, RawQuery)

  val RuleMap: Map[SafetyLevel, VisibilityPolicy] = Map(
    AccessInternalPromotedContent -> InternalPromotedContentPolicy,
    AllSubscribedLists -> AllSubscribedListsPolicy,
    AdsBusinessSettings -> AdsBusinessSettingsPolicy,
    AdsCampaign -> AdsCampaignPolicy,
    AdsManager -> AdsManagerPolicy,
    AdsReportingDashboard -> AdsReportingDashboardPolicy,
    Appeals -> AppealsPolicy,
    ArticleTweetTimeline -> ArticleTweetTimelinePolicy,
    BaseQig -> BaseQigPolicy,
    BirdwatchNoteAuthor -> BirdwatchNoteAuthorPolicy,
    BirdwatchNoteTweetsTimeline -> BirdwatchNoteTweetsTimelinePolicy,
    BirdwatchNeedsYourHelpNotifications -> BirdwatchNeedsYourHelpNotificationsPolicy,
    BlockMuteUsersTimeline -> BlockMuteUsersTimelinePolicy,
    BrandSafety -> BrandSafetyPolicy,
    CardPollVoting -> CardPollVotingPolicy,
    CardsService -> CardsServicePolicy,
    Communities -> CommunitiesPolicy,
    ContentControlToolInstall -> ContentControlToolInstallPolicy,
    ConversationFocalPrehydration -> ConversationFocalPrehydrationPolicy,
    ConversationFocalTweet -> ConversationFocalTweetPolicy,
    ConversationInjectedTweet -> ConversationInjectedTweetPolicy,
    ConversationReply -> ConversationReplyPolicy,
    CuratedTrendsRepresentativeTweet -> CuratedTrendsRepresentativeTweetPolicy,
    CurationPolicyViolations -> CurationPolicyViolationsPolicy,
    FollowingAndFollowersUserList -> FollowingAndFollowersUserListPolicy,
    DeprecatedSafetyLevel -> FilterNonePolicy,
    DevPlatformGetListTweets -> DevPlatformGetListTweetsPolicy,
    DesFollowingAndFollowersUserList -> FollowingAndFollowersUserListPolicy,
    DesHomeTimeline -> DESHomeTimelinePolicy,
    DesQuoteTweetTimeline -> DesQuoteTweetTimelinePolicy,
    DesRealtime -> DESRealtimePolicy,
    DesRealtimeSpamEnrichment -> DESRealtimeSpamEnrichmentPolicy,
    DesRealtimeTweetFilter -> DESRealtimeSpamEnrichmentPolicy,
    DesRetweetingUsers -> DESRetweetingUsersPolicy,
    DesTweetDetail -> DesTweetDetailPolicy,
    DesTweetLikingUsers -> DESTweetLikingUsersPolicy,
    DesUserBookmarks -> DESUserBookmarksPolicy,
    DesUserLikedTweets -> DESUserLikedTweetsPolicy,
    DesUserMentions -> DESUserMentionsPolicy,
    DesUserTweets -> DESUserTweetsPolicy,
    DevPlatformComplianceStream -> DevPlatformComplianceStreamPolicy,
    DirectMessages -> DirectMessagesPolicy,
    DirectMessagesConversationList -> DirectMessagesConversationListPolicy,
    DirectMessagesConversationTimeline -> DirectMessagesConversationTimelinePolicy,
    DirectMessagesInbox -> DirectMessagesInboxPolicy,
    DirectMessagesMutedUsers -> DirectMessagesMutedUsersPolicy,
    DirectMessagesPinned -> DirectMessagesPinnedPolicy,
    DirectMessagesSearch -> DirectMessagesSearchPolicy,
    EditHistoryTimeline -> EditHistoryTimelinePolicy,
    ElevatedQuoteTweetTimeline -> ElevatedQuoteTweetTimelinePolicy,
    EmbeddedTweet -> EmbeddedTweetsPolicy,
    EmbedsPublicInterestNotice -> EmbedsPublicInterestNoticePolicy,
    EmbedTweetMarkup -> EmbedTweetMarkupPolicy,
    WritePathLimitedActionsEnforcement -> WritePathLimitedActionsEnforcementPolicy,
    FilterAll -> FilterAllPolicy,
    FilterAllPlaceholder -> FilterAllPolicy,
    FilterNone -> FilterNonePolicy,
    FilterDefault -> FilterDefaultPolicy,
    FollowedTopicsTimeline -> FollowedTopicsTimelinePolicy,
    FollowerConnections -> FollowerConnectionsPolicy,
    ForDevelopmentOnly -> ForDevelopmentOnlyPolicy,
    FriendsFollowingList -> FriendsFollowingListPolicy,
    GraphqlDefault -> GraphqlDefaultPolicy,
    GryphonDecksAndColumns -> GryphonDecksAndColumnsSharingPolicy,
    HumanizationNudge -> HumanizationNudgePolicy,
    KitchenSinkDevelopment -> KitchenSinkDevelopmentPolicy,
    ListHeader -> ListHeaderPolicy,
    ListMemberships -> ListMembershipsPolicy,
    ListOwnerships -> ListOwnershipsPolicy,
    ListRecommendations -> ListRecommendationsPolicy,
    ListSearch -> ListSearchPolicy,
    ListSubscriptions -> ListSubscriptionsPolicy,
    LivePipelineEngagementCounts -> LivePipelineEngagementCountsPolicy,
    LiveVideoTimeline -> LiveVideoTimelinePolicy,
    MagicRecs -> MagicRecsPolicy,
    MagicRecsAggressive -> MagicRecsAggressivePolicy,
    MagicRecsAggressiveV2 -> MagicRecsAggressiveV2Policy,
    MagicRecsV2 -> MagicRecsV2Policy,
    Minimal -> MinimalPolicy,
    ModeratedTweetsTimeline -> ModeratedTweetsTimelinePolicy,
    Moments -> MomentsPolicy,
    NearbyTimeline -> NearbyTimelinePolicy,
    NewUserExperience -> NewUserExperiencePolicy,
    NotificationsIbis -> NotificationsIbisPolicy,
    NotificationsPlatform -> NotificationsPlatformPolicy,
    NotificationsPlatformPush -> NotificationsPlatformPushPolicy,
    NotificationsQig -> NotificationsQigPolicy,
    NotificationsRead -> NotificationsReadPolicy,
    NotificationsTimelineDeviceFollow -> NotificationsTimelineDeviceFollowPolicy,
    NotificationsWrite -> NotificationsWritePolicy,
    NotificationsWriterV2 -> NotificationsWriterV2Policy,
    NotificationsWriterTweetHydrator -> NotificationsWriterTweetHydratorPolicy,
    ProfileMixerMedia -> ProfileMixerMediaPolicy,
    ProfileMixerFavorites -> ProfileMixerFavoritesPolicy,
    QuickPromoteTweetEligibility -> QuickPromoteTweetEligibilityPolicy,
    QuoteTweetTimeline -> QuoteTweetTimelinePolicy,
    QuotedTweetRules -> QuotedTweetRulesPolicy,
    Recommendations -> RecommendationsPolicy,
    RecosVideo -> RecosVideoPolicy,
    RecosWritePath -> RecosWritePathPolicy,
    RepliesGrouping -> RepliesGroupingPolicy,
    ReportCenter -> ReportCenterPolicy,
    ReturningUserExperience -> ReturningUserExperiencePolicy,
    ReturningUserExperienceFocalTweet -> ReturningUserExperienceFocalTweetPolicy,
    Revenue -> RevenuePolicy,
    RitoActionedTweetTimeline -> RitoActionedTweetTimelinePolicy,
    SearchHydration -> SearchHydrationPolicy,
    SearchMixerSrpMinimal -> SearchMixerSrpMinimalPolicy,
    SearchMixerSrpStrict -> SearchMixerSrpStrictPolicy,
    SearchLatest -> SearchLatestPolicy,
    SearchPeopleSrp -> SearchPeopleSrpPolicy,
    SearchPeopleTypeahead -> SearchPeopleTypeaheadPolicy,
    SearchPhoto -> SearchPhotoPolicy,
    SearchTrendTakeoverPromotedTweet -> SearchTrendTakeoverPromotedTweetPolicy,
    SearchTop -> SearchTopPolicy,
    SearchTopQig -> SearchTopQigPolicy,
    SearchVideo -> SearchVideoPolicy,
    SearchBlenderUserRules -> SearchBlenderUserRulesPolicy,
    SearchLatestUserRules -> SearchLatestUserRulesPolicy,
    ShoppingManagerSpyMode -> ShoppingManagerSpyModePolicy,
    SignalsReactions -> SignalsReactionsPolicy,
    SignalsTweetReactingUsers -> SignalsTweetReactingUsersPolicy,
    SocialProof -> SocialProofPolicy,
    SoftInterventionPivot -> SoftInterventionPivotPolicy,
    SpaceFleetline -> SpaceFleetlinePolicy,
    SpaceHomeTimelineUpranking -> SpaceHomeTimelineUprankingPolicy,
    SpaceJoinScreen -> SpaceJoinScreenPolicy,
    SpaceNotifications -> SpaceNotificationsPolicy,
    Spaces -> SpacesPolicy,
    SpacesParticipants -> SpacesParticipantsPolicy,
    SpacesSellerApplicationStatus -> SpacesSellerApplicationStatusPolicy,
    SpacesSharing -> SpacesSharingPolicy,
    SpaceTweetAvatarHomeTimeline -> SpaceTweetAvatarHomeTimelinePolicy,
    StickersTimeline -> StickersTimelinePolicy,
    StratoExtLimitedEngagements -> StratoExtLimitedEngagementsPolicy,
    StreamServices -> StreamServicesPolicy,
    SuperFollowerConnections -> SuperFollowerConnectionsPolicy,
    SuperLike -> SuperLikePolicy,
    Test -> TestPolicy,
    TimelineContentControls -> TimelineContentControlsPolicy,
    TimelineConversations -> TimelineConversationsPolicy,
    TimelineConversationsDownranking -> TimelineConversationsDownrankingPolicy,
    TimelineConversationsDownrankingMinimal -> TimelineConversationsDownrankingMinimalPolicy,
    TimelineFollowingActivity -> TimelineFollowingActivityPolicy,
    TimelineHome -> TimelineHomePolicy,
    TimelineHomeCommunities -> TimelineHomeCommunitiesPolicy,
    TimelineHomeHydration -> TimelineHomeHydrationPolicy,
    TimelineHomePromotedHydration -> TimelineHomePromotedHydrationPolicy,
    TimelineHomeRecommendations -> TimelineHomeRecommendationsPolicy,
    TimelineHomeTopicFollowRecommendations -> TimelineHomeTopicFollowRecommendationsPolicy,
    TimelineScorer -> TimelineScorerPolicy,
    TopicsLandingPageTopicRecommendations -> TopicsLandingPageTopicRecommendationsPolicy,
    ExploreRecommendations -> ExploreRecommendationsPolicy,
    TimelineInjection -> TimelineInjectionPolicy,
    TimelineMentions -> TimelineMentionsPolicy,
    TimelineModeratedTweetsHydration -> TimelineModeratedTweetsHydrationPolicy,
    TimelineHomeLatest -> TimelineHomeLatestPolicy,
    TimelineLikedBy -> TimelineLikedByPolicy,
    TimelineRetweetedBy -> TimelineRetweetedByPolicy,
    TimelineSuperLikedBy -> TimelineSuperLikedByPolicy,
    TimelineBookmark -> TimelineBookmarkPolicy,
    TimelineMedia -> TimelineMediaPolicy,
    TimelineReactiveBlending -> TimelineReactiveBlendingPolicy,
    TimelineFavorites -> TimelineFavoritesPolicy,
    TimelineFavoritesSelfView -> TimelineFavoritesSelfViewPolicy,
    TimelineLists -> TimelineListsPolicy,
    TimelineProfile -> TimelineProfilePolicy,
    TimelineProfileAll -> TimelineProfileAllPolicy,
    TimelineProfileSpaces -> TimelineProfileSpacesPolicy,
    TimelineProfileSuperFollows -> TimelineProfileSuperFollowsPolicy,
    TimelineFocalTweet -> TimelineFocalTweetPolicy,
    Tombstoning -> TombstoningPolicy,
    TopicRecommendations -> TopicRecommendationsPolicy,
    TrendsRepresentativeTweet -> TrendsRepresentativeTweetPolicy,
    TrustedFriendsUserList -> TrustedFriendsUserListPolicy,
    TweetDetail -> TweetDetailPolicy,
    TweetDetailNonToo -> TweetDetailNonTooPolicy,
    TweetDetailWithInjectionsHydration -> TweetDetailWithInjectionsHydrationPolicy,
    TweetEngagers -> TweetEngagersPolicy,
    TweetReplyNudge -> TweetReplyNudgePolicy,
    TweetScopedTimeline -> TweetScopedTimelinePolicy,
    TweetWritesApi -> TweetWritesApiPolicy,
    TwitterArticleCompose -> TwitterArticleComposePolicy,
    TwitterArticleProfileTab -> TwitterArticleProfileTabPolicy,
    TwitterArticleRead -> TwitterArticleReadPolicy,
    UserMilestoneRecommendation -> UserMilestoneRecommendationPolicy,
    UserProfileHeader -> UserProfileHeaderPolicy,
    UserScopedTimeline -> UserScopedTimelinePolicy,
    UserSearchSrp -> UserSearchSrpPolicy,
    UserSearchTypeahead -> UserSearchTypeaheadPolicy,
    UserSelfViewOnly -> UserSelfViewOnlyPolicy,
    UserSettings -> UserSettingsPolicy,
    VideoAds -> VideoAdsPolicy,
    ZipbirdConsumerArchives -> ZipbirdConsumerArchivesPolicy,
    TweetAward -> TweetAwardPolicy,
  )

  def removeUnusedFeaturesFromFeatureMap(
    featureMap: FeatureMap,
    rules: Seq[Rule],
  ): FeatureMap = {
    val featuresInSafetyLevel: Set[Feature[_]] =
      RuleBase.getFeaturesForRules(rules)
    val filteredMap = featureMap.map.filterKeys(featuresInSafetyLevel.contains(_))

    new FeatureMap(filteredMap, featureMap.constantMap)
  }

  def getFeaturesForRules(rules: Seq[Rule]): Set[Feature[_]] = {
    rules.flatMap { r: Rule =>
      r.featureDependencies ++ r.optionalFeatureDependencies
    }.toSet
  }

  def hasTweetRules(safetyLevel: SafetyLevel): Boolean = RuleMap(safetyLevel).tweetRules.nonEmpty
  def hasUserRules(safetyLevel: SafetyLevel): Boolean = RuleMap(safetyLevel).userRules.nonEmpty
  def hasCardRules(safetyLevel: SafetyLevel): Boolean = RuleMap(safetyLevel).cardRules.nonEmpty
  def hasDmRules(safetyLevel: SafetyLevel): Boolean = RuleMap(safetyLevel).dmRules.nonEmpty
  def hasDmConversationRules(safetyLevel: SafetyLevel): Boolean = RuleMap(
    safetyLevel).dmConversationRules.nonEmpty
  def hasDmEventRules(safetyLevel: SafetyLevel): Boolean = RuleMap(
    safetyLevel).dmEventRules.nonEmpty
}
