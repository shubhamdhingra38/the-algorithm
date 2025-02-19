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
package com.twitter.home_mixer

import com.google.inject.Module
import com.twitter.finagle.Filter
import com.twitter.finatra.annotations.DarkTrafficFilterType
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import com.twitter.finatra.mtls.http.{Mtls => HttpMtls}
import com.twitter.finatra.mtls.thriftmux.Mtls
import com.twitter.finatra.mtls.thriftmux.modules.MtlsThriftWebFormsModule
import com.twitter.finatra.thrift.ThriftServer
import com.twitter.finatra.thrift.filters._
import com.twitter.finatra.thrift.routing.ThriftRouter
import com.twitter.home_mixer.controller.HomeThriftController
import com.twitter.home_mixer.module._
import com.twitter.home_mixer.param.GlobalParamConfigModule
import com.twitter.home_mixer.product.HomeMixerProductModule
import com.twitter.home_mixer.{thriftscala => st}
import com.twitter.product_mixer.component_library.module.AccountRecommendationsMixerModule
import com.twitter.product_mixer.component_library.module.CrMixerClientModule
import com.twitter.product_mixer.component_library.module.DarkTrafficFilterModule
import com.twitter.product_mixer.component_library.module.EarlybirdModule
import com.twitter.product_mixer.component_library.module.ExploreRankerClientModule
import com.twitter.product_mixer.component_library.module.GizmoduckClientModule
import com.twitter.product_mixer.component_library.module.OnboardingTaskServiceModule
import com.twitter.product_mixer.component_library.module.SocialGraphServiceModule
import com.twitter.product_mixer.component_library.module.TimelineMixerClientModule
import com.twitter.product_mixer.component_library.module.TimelineRankerClientModule
import com.twitter.product_mixer.component_library.module.TimelineScorerClientModule
import com.twitter.product_mixer.component_library.module.TimelineServiceClientModule
import com.twitter.product_mixer.component_library.module.TweetImpressionStoreModule
import com.twitter.product_mixer.component_library.module.UserSessionStoreModule
import com.twitter.product_mixer.core.controllers.ProductMixerController
import com.twitter.product_mixer.core.module.LoggingThrowableExceptionMapper
import com.twitter.product_mixer.core.module.ProductMixerModule
import com.twitter.product_mixer.core.module.StratoClientModule
import com.twitter.product_mixer.core.module.stringcenter.ProductScopeStringCenterModule

object HomeMixerServerMain extends HomeMixerServer

class HomeMixerServer extends ThriftServer with Mtls with HttpServer with HttpMtls {
  override val name = "home-mixer-server"

  override val modules: Seq[Module] = Seq(
    AccountRecommendationsMixerModule,
    AdvertiserBrandSafetySettingsStoreModule,
    ClientSentImpressionsPublisherModule,
    ConversationServiceModule,
    CrMixerClientModule,
    EarlybirdModule,
    ExploreRankerClientModule,
    GizmoduckClientModule,
    GlobalParamConfigModule,
    HomeAdsCandidateSourceModule,
    HomeMixerFlagsModule,
    HomeMixerProductModule,
    HomeMixerResourcesModule,
    HomeNaviModelClientModule,
    ImpressionBloomFilterModule,
    InjectionHistoryClientModule,
    FeedbackHistoryClientModule,
    ManhattanClientsModule,
    ManhattanFeatureRepositoryModule,
    ManhattanTweetImpressionStoreModule,
    MemcachedFeatureRepositoryModule,
    OnboardingTaskServiceModule,
    OptimizedStratoClientModule,
    PeopleDiscoveryServiceModule,
    ProductMixerModule,
    RealGraphInNetworkScoresModule,
    RealtimeAggregateFeatureRepositoryModule,
    ScoredTweetsMemcacheModule,
    ScribeEventPublisherModule,
    SimClustersRecentEngagementsClientModule,
    SocialGraphServiceModule,
    StaleTweetsCacheModule,
    StratoClientModule,
    ThriftFeatureRepositoryModule,
    TimelineMixerClientModule,
    TimelineRankerClientModule,
    TimelineScorerClientModule,
    TimelineServiceClientModule,
    TimelinesPersistenceStoreClientModule,
    TweetImpressionStoreModule,
    TweetyPieClientModule,
    TweetypieStaticEntitiesCacheClientModule,
    UserMetadataStoreModule,
    UserSessionStoreModule,
    new DarkTrafficFilterModule[st.HomeMixer.ReqRepServicePerEndpoint](),
    new MtlsThriftWebFormsModule[st.HomeMixer.MethodPerEndpoint](this),
    new ProductScopeStringCenterModule()
  )

  def configureThrift(router: ThriftRouter): Unit = {
    router
      .filter[LoggingMDCFilter]
      .filter[TraceIdMDCFilter]
      .filter[ThriftMDCFilter]
      .filter[StatsFilter]
      .filter[AccessLoggingFilter]
      .filter[ExceptionMappingFilter]
      .filter[Filter.TypeAgnostic, DarkTrafficFilterType]
      .exceptionMapper[LoggingThrowableExceptionMapper]
      .exceptionMapper[PipelineFailureExceptionMapper]
      .add[HomeThriftController]
  }

  override def configureHttp(router: HttpRouter): Unit =
    router.add(
      ProductMixerController[st.HomeMixer.MethodPerEndpoint](
        this.injector,
        st.HomeMixer.ExecutePipeline))

  override protected def warmup(): Unit = {
    handle[HomeMixerThriftServerWarmupHandler]()
    handle[HomeMixerHttpServerWarmupHandler]()
  }
}
