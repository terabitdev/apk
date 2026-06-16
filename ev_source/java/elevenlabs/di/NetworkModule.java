package io.elevenlabs.di;

import a2.a0;
import android.content.Context;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.protobuf.c6;
import ib.i;
import io.elevenlabs.data.api.AccountAPI;
import io.elevenlabs.data.api.AssistantAPI;
import io.elevenlabs.data.api.AuthorApi;
import io.elevenlabs.data.api.CollectionsAPI;
import io.elevenlabs.data.api.CommunityVoicesApi;
import io.elevenlabs.data.api.ConfigAPI;
import io.elevenlabs.data.api.ConsumptionAPI;
import io.elevenlabs.data.api.CustomerAPI;
import io.elevenlabs.data.api.DeleteAccountAPI;
import io.elevenlabs.data.api.DrmAPI;
import io.elevenlabs.data.api.ExploreCollectionsAPI;
import io.elevenlabs.data.api.ExploreVoiceCollectionsApi;
import io.elevenlabs.data.api.ExploreVoicesApi;
import io.elevenlabs.data.api.FavoriteVoicesApi;
import io.elevenlabs.data.api.GooglePlayAPI;
import io.elevenlabs.data.api.HomeAPI;
import io.elevenlabs.data.api.InterestsAPI;
import io.elevenlabs.data.api.MediaAPI;
import io.elevenlabs.data.api.MessagesAPI;
import io.elevenlabs.data.api.NotificationsApi;
import io.elevenlabs.data.api.OnboardingAPI;
import io.elevenlabs.data.api.PasswordResetAPI;
import io.elevenlabs.data.api.ProductsAPI;
import io.elevenlabs.data.api.PronunciationsAPI;
import io.elevenlabs.data.api.PublisherApi;
import io.elevenlabs.data.api.ReadBookmarksAPI;
import io.elevenlabs.data.api.ReadBookmarksVideoAPI;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.api.ReadsDownloadAPI;
import io.elevenlabs.data.api.ReadsExploreSearchAPI;
import io.elevenlabs.data.api.ReadsStreamingAPI;
import io.elevenlabs.data.api.ReadsUploadAPI;
import io.elevenlabs.data.api.RecentVoicesApi;
import io.elevenlabs.data.api.ReferralAPI;
import io.elevenlabs.data.api.SignUpAPI;
import io.elevenlabs.data.api.SoundscapesAPI;
import io.elevenlabs.data.api.StreamingAPI;
import io.elevenlabs.data.api.SupportAgentAPI;
import io.elevenlabs.data.api.VoiceDesignAPI;
import io.elevenlabs.data.api.VoicesAPI;
import io.elevenlabs.data.api.adapter.ResultCallAdapterFactory;
import io.elevenlabs.data.api.interceptors.AuthorizationInterceptor;
import io.elevenlabs.data.api.interceptors.CacheInterceptor;
import io.elevenlabs.data.api.interceptors.CertificateValidationInterceptor;
import io.elevenlabs.data.api.interceptors.RetryInterceptor;
import io.elevenlabs.data.api.interceptors.TraceInterceptor;
import io.elevenlabs.data.serializer.JsonKt;
import io.elevenlabs.domain.CertificateMismatchReporter;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.ConfigurationKt;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AuthService;
import io.elevenlabs.domain.services.AuthTokenService;
import io.elevenlabs.domain.services.DeviceUuidService;
import io.elevenlabs.domain.services.LocaleService;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Cache;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.internal._UtilJvmKt;
import okhttp3.logging.HttpLoggingInterceptor;
import wq.l;
import xq.d;
import xq.g;
import zs.r0;
import zs.s0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000²\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018JW\u0010&\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'JW\u0010)\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010(\u001a\u00020$H\u0007¢\u0006\u0004\b)\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u00020B2\b\b\u0001\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020H2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020K2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020N2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020Q2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020T2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bU\u0010VJ\u0019\u0010X\u001a\u00020W2\b\b\u0001\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bX\u0010YJ\u0017\u0010]\u001a\u00020\\2\u0006\u0010[\u001a\u00020ZH\u0007¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020_2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020b2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020e2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020h2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020k2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020n2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020q2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\br\u0010sJ\u0019\u0010u\u001a\u00020t2\b\b\u0001\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bu\u0010vJ\u0017\u0010x\u001a\u00020w2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020z2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020}2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001b\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001b\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001b\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001b\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001b\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001b\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J+\u0010¢\u0001\u001a\u00030¡\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J[\u0010¥\u0001\u001a\u00030¤\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010(\u001a\u00020$H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001¨\u0006§\u0001"}, d2 = {"Lio/elevenlabs/di/NetworkModule;", "", "<init>", "()V", "Lvr/c;", "provideJsonSerializer", "()Lvr/c;", "Lio/elevenlabs/domain/Configuration;", "configuration", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lio/elevenlabs/data/api/adapter/ResultCallAdapterFactory;", "resultCallAdapterFactory", "Lzs/s0;", "provideRetrofit", "(Lio/elevenlabs/domain/Configuration;Lokhttp3/OkHttpClient;Lio/elevenlabs/data/api/adapter/ResultCallAdapterFactory;)Lzs/s0;", "provideDownloadRetrofit", "retrofit", "provideUploadRetrofit", "(Lzs/s0;Lokhttp3/OkHttpClient;)Lzs/s0;", "Landroid/content/Context;", "context", "Lokhttp3/Cache;", "cache", "(Landroid/content/Context;)Lokhttp3/Cache;", "Lio/elevenlabs/domain/services/AuthTokenService;", "authTokenService", "Lio/elevenlabs/domain/services/AuthService;", "authService", "Lio/elevenlabs/domain/services/LocaleService;", "localeService", "Lio/elevenlabs/domain/services/DeviceUuidService;", "deviceUuidService", "Lio/elevenlabs/domain/Logger;", "logger", "json", "Lio/elevenlabs/domain/CertificateMismatchReporter;", "certMismatchReporter", "provideOkHttpClient", "(Lio/elevenlabs/domain/services/AuthTokenService;Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/Configuration;Lokhttp3/Cache;Lio/elevenlabs/domain/services/LocaleService;Lio/elevenlabs/domain/services/DeviceUuidService;Lio/elevenlabs/domain/Logger;Lvr/c;Lio/elevenlabs/domain/CertificateMismatchReporter;)Lokhttp3/OkHttpClient;", "certReporter", "provideDownloadOkHttpClient", "Lio/elevenlabs/data/api/VoicesAPI;", "voicesApi", "(Lzs/s0;)Lio/elevenlabs/data/api/VoicesAPI;", "Lio/elevenlabs/data/api/VoiceDesignAPI;", "voiceDesignApi", "(Lzs/s0;)Lio/elevenlabs/data/api/VoiceDesignAPI;", "Lio/elevenlabs/data/api/PronunciationsAPI;", "pronunciationApi", "(Lzs/s0;)Lio/elevenlabs/data/api/PronunciationsAPI;", "Lio/elevenlabs/data/api/FavoriteVoicesApi;", "favoriteVoicesApi", "(Lzs/s0;)Lio/elevenlabs/data/api/FavoriteVoicesApi;", "Lio/elevenlabs/data/api/CommunityVoicesApi;", "communityVoicesApi", "(Lzs/s0;)Lio/elevenlabs/data/api/CommunityVoicesApi;", "Lio/elevenlabs/data/api/RecentVoicesApi;", "recentVoicesApi", "(Lzs/s0;)Lio/elevenlabs/data/api/RecentVoicesApi;", "Lio/elevenlabs/data/api/ReadsAPI;", "readsApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ReadsAPI;", "Lio/elevenlabs/data/api/ConsumptionAPI;", "consumptionApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ConsumptionAPI;", "Lio/elevenlabs/data/api/ReadsDownloadAPI;", "readsDownloadApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ReadsDownloadAPI;", "Lio/elevenlabs/data/api/ConfigAPI;", "configApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ConfigAPI;", "Lio/elevenlabs/data/api/NotificationsApi;", "notificationsApi", "(Lzs/s0;)Lio/elevenlabs/data/api/NotificationsApi;", "Lio/elevenlabs/data/api/OnboardingAPI;", "onboardingApi", "(Lzs/s0;)Lio/elevenlabs/data/api/OnboardingAPI;", "Lio/elevenlabs/data/api/InterestsAPI;", "interestsApi", "(Lzs/s0;)Lio/elevenlabs/data/api/InterestsAPI;", "Lio/elevenlabs/data/api/PasswordResetAPI;", "passwordResetApi", "(Lzs/s0;)Lio/elevenlabs/data/api/PasswordResetAPI;", "Lio/elevenlabs/data/api/SignUpAPI;", "signUpApi", "(Lzs/s0;)Lio/elevenlabs/data/api/SignUpAPI;", "Lio/elevenlabs/data/api/ReadsUploadAPI;", "readsUploadApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ReadsUploadAPI;", "Lio/elevenlabs/data/api/ReadsStreamingAPI;", "readsStreamingAPI", "Lio/elevenlabs/data/api/StreamingAPI;", "streamingApi", "(Lio/elevenlabs/data/api/ReadsStreamingAPI;)Lio/elevenlabs/data/api/StreamingAPI;", "Lio/elevenlabs/data/api/CollectionsAPI;", "collectionsApi", "(Lzs/s0;)Lio/elevenlabs/data/api/CollectionsAPI;", "Lio/elevenlabs/data/api/ExploreCollectionsAPI;", "exploreCollectionsApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ExploreCollectionsAPI;", "Lio/elevenlabs/data/api/HomeAPI;", "homeApi", "(Lzs/s0;)Lio/elevenlabs/data/api/HomeAPI;", "Lio/elevenlabs/data/api/ReadsExploreSearchAPI;", "readsExploreSearchApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ReadsExploreSearchAPI;", "Lio/elevenlabs/data/api/ExploreVoicesApi;", "exploreVoicesApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ExploreVoicesApi;", "Lio/elevenlabs/data/api/ExploreVoiceCollectionsApi;", "exploreVoiceCollectionsApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ExploreVoiceCollectionsApi;", "Lio/elevenlabs/data/api/ReadBookmarksAPI;", "readBookmarksApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ReadBookmarksAPI;", "Lio/elevenlabs/data/api/ReadBookmarksVideoAPI;", "readBookmarksVideoApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ReadBookmarksVideoAPI;", "Lio/elevenlabs/data/api/PublisherApi;", "publisherApi", "(Lzs/s0;)Lio/elevenlabs/data/api/PublisherApi;", "Lio/elevenlabs/data/api/AuthorApi;", "authorApi", "(Lzs/s0;)Lio/elevenlabs/data/api/AuthorApi;", "Lio/elevenlabs/data/api/AccountAPI;", "accountApi", "(Lzs/s0;)Lio/elevenlabs/data/api/AccountAPI;", "Lio/elevenlabs/data/api/CustomerAPI;", "customerApi", "(Lzs/s0;)Lio/elevenlabs/data/api/CustomerAPI;", "Lio/elevenlabs/data/api/ProductsAPI;", "productsApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ProductsAPI;", "Lio/elevenlabs/data/api/GooglePlayAPI;", "googlePlayApi", "(Lzs/s0;)Lio/elevenlabs/data/api/GooglePlayAPI;", "Lio/elevenlabs/data/api/MessagesAPI;", "messagesApi", "(Lzs/s0;)Lio/elevenlabs/data/api/MessagesAPI;", "Lio/elevenlabs/data/api/ReferralAPI;", "referralApi", "(Lzs/s0;)Lio/elevenlabs/data/api/ReferralAPI;", "Lio/elevenlabs/data/api/DeleteAccountAPI;", "deleteAccountApi", "(Lzs/s0;)Lio/elevenlabs/data/api/DeleteAccountAPI;", "Lio/elevenlabs/data/api/SoundscapesAPI;", "soundscapesApi", "(Lzs/s0;)Lio/elevenlabs/data/api/SoundscapesAPI;", "Lio/elevenlabs/data/api/AssistantAPI;", "assistantApi", "(Lzs/s0;)Lio/elevenlabs/data/api/AssistantAPI;", "Lio/elevenlabs/data/api/SupportAgentAPI;", "supportAgentApi", "(Lzs/s0;)Lio/elevenlabs/data/api/SupportAgentAPI;", "Lio/elevenlabs/data/api/MediaAPI;", "mediaApi", "(Lzs/s0;)Lio/elevenlabs/data/api/MediaAPI;", "Lio/elevenlabs/data/api/DrmAPI;", "drmApi", "(Lzs/s0;)Lio/elevenlabs/data/api/DrmAPI;", "Lzs/r0;", "baseRetrofitBuilder", "(Lio/elevenlabs/domain/Configuration;Lokhttp3/OkHttpClient;Lio/elevenlabs/data/api/adapter/ResultCallAdapterFactory;)Lzs/r0;", "Lokhttp3/OkHttpClient$Builder;", "baseOkHttpBuilderWithoutLoggingInterceptor", "(Lio/elevenlabs/domain/services/AuthTokenService;Lio/elevenlabs/domain/services/AuthService;Lio/elevenlabs/domain/Configuration;Lokhttp3/Cache;Lio/elevenlabs/domain/services/LocaleService;Lio/elevenlabs/domain/services/DeviceUuidService;Lio/elevenlabs/domain/Logger;Lvr/c;Lio/elevenlabs/domain/CertificateMismatchReporter;)Lokhttp3/OkHttpClient$Builder;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NetworkModule {
    public static final NetworkModule INSTANCE = new NetworkModule();

    private NetworkModule() {
    }

    private final OkHttpClient.Builder baseOkHttpBuilderWithoutLoggingInterceptor(AuthTokenService authTokenService, AuthService authService, final Configuration configuration, Cache cache, final LocaleService localeService, DeviceUuidService deviceUuidService, Logger logger, vr.c json, CertificateMismatchReporter certReporter) {
        long e10;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.f25377l = cache;
        final int i10 = 0;
        builder.f25371f = false;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        builder.f25388x = _UtilJvmKt.b(3L, timeUnit);
        timeUnit.getClass();
        builder.f25389y = _UtilJvmKt.b(20L, timeUnit);
        builder.f25390z = _UtilJvmKt.b(20L, timeUnit);
        xq.a aVar = xq.b.f38124b;
        double b10 = g.b(d.NANOSECONDS);
        if (!Double.isNaN(b10)) {
            long z6 = jo.a.z(b10);
            if (-4611686018426999999L <= z6 && z6 < 4611686018427000000L) {
                e10 = g.f(z6);
            } else {
                e10 = g.e(jo.a.z(g.b(d.MILLISECONDS)));
            }
            RetryInterceptor retryInterceptor = new RetryInterceptor(3, e10, logger, null);
            ArrayList arrayList = builder.f25368c;
            arrayList.add(retryInterceptor);
            arrayList.add(new AuthorizationInterceptor(authTokenService, authService, logger, json));
            CacheInterceptor cacheInterceptor = new CacheInterceptor();
            ArrayList arrayList2 = builder.f25369d;
            arrayList2.add(cacheInterceptor);
            arrayList2.add(new TraceInterceptor(logger));
            arrayList.add(new StaticHeaderInterceptor("Language", new ho.a() { // from class: io.elevenlabs.di.b
                @Override // ho.a
                public final Object invoke() {
                    String language;
                    String locale;
                    switch (i10) {
                        case 0:
                            language = localeService.getLanguage();
                            return language;
                        default:
                            locale = localeService.getLocale();
                            return locale;
                    }
                }
            }));
            final int i11 = 1;
            arrayList.add(new StaticHeaderInterceptor("Language-Locale", new ho.a() { // from class: io.elevenlabs.di.b
                @Override // ho.a
                public final Object invoke() {
                    String language;
                    String locale;
                    switch (i11) {
                        case 0:
                            language = localeService.getLanguage();
                            return language;
                        default:
                            locale = localeService.getLocale();
                            return locale;
                    }
                }
            }));
            arrayList.add(new StaticHeaderInterceptor("User-TimeZone", new io.elevenlabs.data.model.response.d(25)));
            arrayList.add(new StaticHeaderInterceptor("Device-Id", new a0(deviceUuidService, 26)));
            arrayList.add(new StaticHeaderInterceptor("App-Version", new ho.a() { // from class: io.elevenlabs.di.c
                @Override // ho.a
                public final Object invoke() {
                    String appVersionName;
                    String baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5;
                    String httpUserAgent;
                    switch (i10) {
                        case 0:
                            appVersionName = configuration.getAppVersionName();
                            return appVersionName;
                        case 1:
                            baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5 = NetworkModule.baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5(configuration);
                            return baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5;
                        default:
                            httpUserAgent = ConfigurationKt.getHttpUserAgent(configuration);
                            return httpUserAgent;
                    }
                }
            }));
            arrayList.add(new StaticHeaderInterceptor("App-Version-Code", new ho.a() { // from class: io.elevenlabs.di.c
                @Override // ho.a
                public final Object invoke() {
                    String appVersionName;
                    String baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5;
                    String httpUserAgent;
                    switch (i11) {
                        case 0:
                            appVersionName = configuration.getAppVersionName();
                            return appVersionName;
                        case 1:
                            baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5 = NetworkModule.baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5(configuration);
                            return baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5;
                        default:
                            httpUserAgent = ConfigurationKt.getHttpUserAgent(configuration);
                            return httpUserAgent;
                    }
                }
            }));
            final int i12 = 2;
            arrayList.add(new StaticHeaderInterceptor(SIPHeaderNames.USER_AGENT, new ho.a() { // from class: io.elevenlabs.di.c
                @Override // ho.a
                public final Object invoke() {
                    String appVersionName;
                    String baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5;
                    String httpUserAgent;
                    switch (i12) {
                        case 0:
                            appVersionName = configuration.getAppVersionName();
                            return appVersionName;
                        case 1:
                            baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5 = NetworkModule.baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5(configuration);
                            return baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5;
                        default:
                            httpUserAgent = ConfigurationKt.getHttpUserAgent(configuration);
                            return httpUserAgent;
                    }
                }
            }));
            arrayList2.add(new CertificateValidationInterceptor(certReporter, logger));
            return builder;
        }
        c6.t("Duration value cannot be NaN.");
        return null;
    }

    public static final String baseOkHttpBuilderWithoutLoggingInterceptor$lambda$2() {
        String id2 = TimeZone.getDefault().getID();
        id2.getClass();
        return id2;
    }

    public static final String baseOkHttpBuilderWithoutLoggingInterceptor$lambda$5(Configuration configuration) {
        return String.valueOf(configuration.getAppVersionCode());
    }

    private final r0 baseRetrofitBuilder(Configuration configuration, OkHttpClient okHttpClient, ResultCallAdapterFactory resultCallAdapterFactory) {
        r0 r0Var = new r0();
        String apiUrl = configuration.getApiUrl();
        Objects.requireNonNull(apiUrl, "baseUrl == null");
        HttpUrl c5 = HttpUrl.Companion.c(apiUrl);
        if ("".equals(c5.f25309f.get(r1.size() - 1))) {
            r0Var.f39819b = c5;
            Objects.requireNonNull(okHttpClient, "client == null");
            r0Var.f39818a = okHttpClient;
            vr.c json = JsonKt.getJson();
            l lVar = MediaType.f25321e;
            MediaType a10 = MediaType.Companion.a("application/json; charset=UTF8");
            json.getClass();
            at.a aVar = new at.a(a10, new at.b(json));
            ArrayList arrayList = r0Var.f39820c;
            arrayList.add(aVar);
            arrayList.add(new bt.c(0));
            Objects.requireNonNull(resultCallAdapterFactory, "factory == null");
            r0Var.f39821d.add(resultCallAdapterFactory);
            return r0Var;
        }
        com.google.android.recaptcha.internal.a.f(c5, "baseUrl must end in /: ");
        return null;
    }

    public final AccountAPI accountApi(s0 retrofit) {
        return (AccountAPI) i.i(retrofit, AccountAPI.class);
    }

    public final AssistantAPI assistantApi(s0 retrofit) {
        return (AssistantAPI) i.i(retrofit, AssistantAPI.class);
    }

    public final AuthorApi authorApi(s0 retrofit) {
        return (AuthorApi) i.i(retrofit, AuthorApi.class);
    }

    public final Cache cache(Context context) {
        context.getClass();
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        return new Cache(cacheDir);
    }

    public final CollectionsAPI collectionsApi(s0 retrofit) {
        return (CollectionsAPI) i.i(retrofit, CollectionsAPI.class);
    }

    public final CommunityVoicesApi communityVoicesApi(s0 retrofit) {
        return (CommunityVoicesApi) i.i(retrofit, CommunityVoicesApi.class);
    }

    public final ConfigAPI configApi(s0 retrofit) {
        return (ConfigAPI) i.i(retrofit, ConfigAPI.class);
    }

    public final ConsumptionAPI consumptionApi(s0 retrofit) {
        return (ConsumptionAPI) i.i(retrofit, ConsumptionAPI.class);
    }

    public final CustomerAPI customerApi(s0 retrofit) {
        return (CustomerAPI) i.i(retrofit, CustomerAPI.class);
    }

    public final DeleteAccountAPI deleteAccountApi(s0 retrofit) {
        return (DeleteAccountAPI) i.i(retrofit, DeleteAccountAPI.class);
    }

    public final DrmAPI drmApi(s0 retrofit) {
        return (DrmAPI) i.i(retrofit, DrmAPI.class);
    }

    public final ExploreCollectionsAPI exploreCollectionsApi(s0 retrofit) {
        return (ExploreCollectionsAPI) i.i(retrofit, ExploreCollectionsAPI.class);
    }

    public final ExploreVoiceCollectionsApi exploreVoiceCollectionsApi(s0 retrofit) {
        return (ExploreVoiceCollectionsApi) i.i(retrofit, ExploreVoiceCollectionsApi.class);
    }

    public final ExploreVoicesApi exploreVoicesApi(s0 retrofit) {
        return (ExploreVoicesApi) i.i(retrofit, ExploreVoicesApi.class);
    }

    public final FavoriteVoicesApi favoriteVoicesApi(s0 retrofit) {
        return (FavoriteVoicesApi) i.i(retrofit, FavoriteVoicesApi.class);
    }

    public final GooglePlayAPI googlePlayApi(s0 retrofit) {
        return (GooglePlayAPI) i.i(retrofit, GooglePlayAPI.class);
    }

    public final HomeAPI homeApi(s0 retrofit) {
        return (HomeAPI) i.i(retrofit, HomeAPI.class);
    }

    public final InterestsAPI interestsApi(s0 retrofit) {
        return (InterestsAPI) i.i(retrofit, InterestsAPI.class);
    }

    public final MediaAPI mediaApi(s0 retrofit) {
        return (MediaAPI) i.i(retrofit, MediaAPI.class);
    }

    public final MessagesAPI messagesApi(s0 retrofit) {
        return (MessagesAPI) i.i(retrofit, MessagesAPI.class);
    }

    public final NotificationsApi notificationsApi(s0 retrofit) {
        return (NotificationsApi) i.i(retrofit, NotificationsApi.class);
    }

    public final OnboardingAPI onboardingApi(s0 retrofit) {
        return (OnboardingAPI) i.i(retrofit, OnboardingAPI.class);
    }

    public final PasswordResetAPI passwordResetApi(s0 retrofit) {
        return (PasswordResetAPI) i.i(retrofit, PasswordResetAPI.class);
    }

    public final ProductsAPI productsApi(s0 retrofit) {
        return (ProductsAPI) i.i(retrofit, ProductsAPI.class);
    }

    public final PronunciationsAPI pronunciationApi(s0 retrofit) {
        return (PronunciationsAPI) i.i(retrofit, PronunciationsAPI.class);
    }

    @DownloadOkHttpClient
    public final OkHttpClient provideDownloadOkHttpClient(AuthTokenService authTokenService, AuthService authService, Configuration configuration, Cache cache, LocaleService localeService, DeviceUuidService deviceUuidService, Logger logger, vr.c json, CertificateMismatchReporter certReporter) {
        HttpLoggingInterceptor.Level level;
        authTokenService.getClass();
        authService.getClass();
        configuration.getClass();
        cache.getClass();
        localeService.getClass();
        deviceUuidService.getClass();
        logger.getClass();
        json.getClass();
        certReporter.getClass();
        OkHttpClient.Builder baseOkHttpBuilderWithoutLoggingInterceptor = baseOkHttpBuilderWithoutLoggingInterceptor(authTokenService, authService, configuration, cache, localeService, deviceUuidService, logger, json, certReporter);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        if (configuration.getDebugMode()) {
            level = HttpLoggingInterceptor.Level.f25926b;
        } else {
            level = HttpLoggingInterceptor.Level.f25925a;
        }
        httpLoggingInterceptor.f25924b = level;
        baseOkHttpBuilderWithoutLoggingInterceptor.getClass();
        baseOkHttpBuilderWithoutLoggingInterceptor.f25368c.add(httpLoggingInterceptor);
        return new OkHttpClient(baseOkHttpBuilderWithoutLoggingInterceptor);
    }

    @DownloadRetrofit
    public final s0 provideDownloadRetrofit(Configuration configuration, @DownloadOkHttpClient OkHttpClient okHttpClient, ResultCallAdapterFactory resultCallAdapterFactory) {
        configuration.getClass();
        okHttpClient.getClass();
        resultCallAdapterFactory.getClass();
        return baseRetrofitBuilder(configuration, okHttpClient, resultCallAdapterFactory).a();
    }

    public final vr.c provideJsonSerializer() {
        return JsonKt.getJson();
    }

    public final OkHttpClient provideOkHttpClient(AuthTokenService authTokenService, AuthService authService, Configuration configuration, Cache cache, LocaleService localeService, DeviceUuidService deviceUuidService, Logger logger, vr.c json, CertificateMismatchReporter certMismatchReporter) {
        HttpLoggingInterceptor.Level level;
        authTokenService.getClass();
        authService.getClass();
        configuration.getClass();
        cache.getClass();
        localeService.getClass();
        deviceUuidService.getClass();
        logger.getClass();
        json.getClass();
        certMismatchReporter.getClass();
        OkHttpClient.Builder baseOkHttpBuilderWithoutLoggingInterceptor = baseOkHttpBuilderWithoutLoggingInterceptor(authTokenService, authService, configuration, cache, localeService, deviceUuidService, logger, json, certMismatchReporter);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        if (configuration.getDebugMode()) {
            level = HttpLoggingInterceptor.Level.f25928d;
        } else {
            level = HttpLoggingInterceptor.Level.f25925a;
        }
        httpLoggingInterceptor.f25924b = level;
        baseOkHttpBuilderWithoutLoggingInterceptor.getClass();
        baseOkHttpBuilderWithoutLoggingInterceptor.f25368c.add(httpLoggingInterceptor);
        return new OkHttpClient(baseOkHttpBuilderWithoutLoggingInterceptor);
    }

    public final s0 provideRetrofit(Configuration configuration, OkHttpClient okHttpClient, ResultCallAdapterFactory resultCallAdapterFactory) {
        configuration.getClass();
        okHttpClient.getClass();
        resultCallAdapterFactory.getClass();
        return baseRetrofitBuilder(configuration, okHttpClient, resultCallAdapterFactory).a();
    }

    @UploadRetrofit
    public final s0 provideUploadRetrofit(s0 retrofit, OkHttpClient okHttpClient) {
        retrofit.getClass();
        okHttpClient.getClass();
        r0 r0Var = new r0(retrofit);
        OkHttpClient.Builder c5 = okHttpClient.c();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.getClass();
        c5.f25389y = _UtilJvmKt.b(2L, timeUnit);
        c5.f25390z = _UtilJvmKt.b(2L, timeUnit);
        r0Var.f39818a = new OkHttpClient(c5);
        return r0Var.a();
    }

    public final PublisherApi publisherApi(s0 retrofit) {
        return (PublisherApi) i.i(retrofit, PublisherApi.class);
    }

    public final ReadBookmarksAPI readBookmarksApi(s0 retrofit) {
        return (ReadBookmarksAPI) i.i(retrofit, ReadBookmarksAPI.class);
    }

    public final ReadBookmarksVideoAPI readBookmarksVideoApi(@UploadRetrofit s0 retrofit) {
        return (ReadBookmarksVideoAPI) i.i(retrofit, ReadBookmarksVideoAPI.class);
    }

    public final ReadsAPI readsApi(s0 retrofit) {
        return (ReadsAPI) i.i(retrofit, ReadsAPI.class);
    }

    public final ReadsDownloadAPI readsDownloadApi(@DownloadRetrofit s0 retrofit) {
        return (ReadsDownloadAPI) i.i(retrofit, ReadsDownloadAPI.class);
    }

    public final ReadsExploreSearchAPI readsExploreSearchApi(s0 retrofit) {
        return (ReadsExploreSearchAPI) i.i(retrofit, ReadsExploreSearchAPI.class);
    }

    public final ReadsUploadAPI readsUploadApi(@UploadRetrofit s0 retrofit) {
        return (ReadsUploadAPI) i.i(retrofit, ReadsUploadAPI.class);
    }

    public final RecentVoicesApi recentVoicesApi(s0 retrofit) {
        return (RecentVoicesApi) i.i(retrofit, RecentVoicesApi.class);
    }

    public final ReferralAPI referralApi(s0 retrofit) {
        return (ReferralAPI) i.i(retrofit, ReferralAPI.class);
    }

    public final SignUpAPI signUpApi(s0 retrofit) {
        return (SignUpAPI) i.i(retrofit, SignUpAPI.class);
    }

    public final SoundscapesAPI soundscapesApi(s0 retrofit) {
        return (SoundscapesAPI) i.i(retrofit, SoundscapesAPI.class);
    }

    public final StreamingAPI streamingApi(ReadsStreamingAPI readsStreamingAPI) {
        readsStreamingAPI.getClass();
        return readsStreamingAPI;
    }

    public final SupportAgentAPI supportAgentApi(s0 retrofit) {
        return (SupportAgentAPI) i.i(retrofit, SupportAgentAPI.class);
    }

    public final VoiceDesignAPI voiceDesignApi(s0 retrofit) {
        return (VoiceDesignAPI) i.i(retrofit, VoiceDesignAPI.class);
    }

    public final VoicesAPI voicesApi(s0 retrofit) {
        return (VoicesAPI) i.i(retrofit, VoicesAPI.class);
    }
}
