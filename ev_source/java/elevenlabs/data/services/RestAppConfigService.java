package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.ConfigAPI;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.LinkResponseModel;
import io.elevenlabs.data.model.response.ReaderAppConfigResponseModel;
import io.elevenlabs.data.model.response.ReportLinksResponseModel;
import io.elevenlabs.di.GlobalSharedPreferences;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AppConfig;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.Link;
import io.elevenlabs.domain.model.ReportLinks;
import io.elevenlabs.domain.services.AppConfigService;
import io.elevenlabs.domain.services.ConnectivityService;
import ir.a1;
import ir.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001%B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006&"}, d2 = {"Lio/elevenlabs/data/services/RestAppConfigService;", "Lio/elevenlabs/domain/services/AppConfigService;", "Lio/elevenlabs/data/api/ConfigAPI;", "configAPI", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/services/ConnectivityService;", "connectivityService", "<init>", "(Lio/elevenlabs/data/api/ConfigAPI;Landroid/content/SharedPreferences;Lvr/c;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/services/ConnectivityService;)V", "Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;", "Lio/elevenlabs/domain/model/AppConfig;", "toDomain", "(Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;)Lio/elevenlabs/domain/model/AppConfig;", "Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "sync", "()Lir/i;", "getConfig", "", "readId", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/ReportLinks;", "getReportLinks", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/ConfigAPI;", "Landroid/content/SharedPreferences;", "Lvr/c;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/services/ConnectivityService;", ParameterNames.TAG, "Ljava/lang/String;", "prefConfig", "AppConfigSyncException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RestAppConfigService implements AppConfigService {
    private final ConfigAPI configAPI;
    private final ConnectivityService connectivityService;
    private final vr.c json;
    private final Logger logger;
    private final String prefConfig;
    private final SharedPreferences sharedPreferences;
    private final String tag;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/services/RestAppConfigService$AppConfigSyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class AppConfigSyncException extends Exception {
    }

    public RestAppConfigService(ConfigAPI configAPI, @GlobalSharedPreferences SharedPreferences sharedPreferences, vr.c cVar, Logger logger, ConnectivityService connectivityService) {
        configAPI.getClass();
        sharedPreferences.getClass();
        cVar.getClass();
        logger.getClass();
        connectivityService.getClass();
        this.configAPI = configAPI;
        this.sharedPreferences = sharedPreferences;
        this.json = cVar;
        this.logger = logger;
        this.connectivityService = connectivityService;
        this.tag = "ConfigService";
        this.prefConfig = "APP_CONFIG";
    }

    public static /* synthetic */ ReportLinks a(ReportLinksResponseModel reportLinksResponseModel) {
        return getReportLinks$lambda$0(reportLinksResponseModel);
    }

    public static final ReportLinks getReportLinks$lambda$0(ReportLinksResponseModel reportLinksResponseModel) {
        reportLinksResponseModel.getClass();
        List<LinkResponseModel> links = reportLinksResponseModel.getLinks();
        ArrayList arrayList = new ArrayList(p.a0(links, 10));
        for (LinkResponseModel linkResponseModel : links) {
            arrayList.add(new Link(linkResponseModel.getTitle(), linkResponseModel.getUrl(), linkResponseModel.getIconUrl()));
        }
        return new ReportLinks(arrayList);
    }

    public final AppConfig toDomain(ReaderAppConfigResponseModel readerAppConfigResponseModel) {
        String defaultVoice = readerAppConfigResponseModel.getDefaultVoice();
        String androidMinAppVersion = readerAppConfigResponseModel.getAndroidMinAppVersion();
        if (androidMinAppVersion == null) {
            androidMinAppVersion = "0.0.0";
        }
        String str = androidMinAppVersion;
        Map<String, String> androidNotificationChannels = readerAppConfigResponseModel.getAndroidNotificationChannels();
        ArrayList arrayList = new ArrayList(androidNotificationChannels.size());
        for (Map.Entry<String, String> entry : androidNotificationChannels.entrySet()) {
            arrayList.add(new AppConfig.NotificationChannelConfig(entry.getKey(), entry.getValue()));
        }
        String reportProblemUrl = readerAppConfigResponseModel.getReportProblemUrl();
        if (reportProblemUrl == null) {
            reportProblemUrl = "";
        }
        String copyrightTakedownUrl = readerAppConfigResponseModel.getCopyrightTakedownUrl();
        if (copyrightTakedownUrl == null) {
            copyrightTakedownUrl = "";
        }
        String contentProviderWaitlistUrl = readerAppConfigResponseModel.getContentProviderWaitlistUrl();
        if (contentProviderWaitlistUrl == null) {
            contentProviderWaitlistUrl = "";
        }
        return new AppConfig(defaultVoice, str, arrayList, reportProblemUrl, copyrightTakedownUrl, contentProviderWaitlistUrl, readerAppConfigResponseModel.getAndroidRtlCanvasValidation());
    }

    @Override // io.elevenlabs.domain.services.AppConfigService
    public ir.i getConfig() {
        return new a1(SharedPreferencesExtensionsKt.observe(this.sharedPreferences, this.prefConfig, new RestAppConfigService$getConfig$1(this, null)), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.AppConfigService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getReportLinks(String str, wn.c<? super AsyncCallResult<ReportLinks>> cVar) {
        RestAppConfigService$getReportLinks$1 restAppConfigService$getReportLinks$1;
        int i10;
        if (cVar instanceof RestAppConfigService$getReportLinks$1) {
            restAppConfigService$getReportLinks$1 = (RestAppConfigService$getReportLinks$1) cVar;
            int i11 = restAppConfigService$getReportLinks$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                restAppConfigService$getReportLinks$1.label = i11 - Integer.MIN_VALUE;
                Object obj = restAppConfigService$getReportLinks$1.result;
                i10 = restAppConfigService$getReportLinks$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ConfigAPI configAPI = this.configAPI;
                    restAppConfigService$getReportLinks$1.L$0 = null;
                    restAppConfigService$getReportLinks$1.label = 1;
                    obj = configAPI.getReportLinks(str, restAppConfigService$getReportLinks$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new h(2));
            }
        }
        restAppConfigService$getReportLinks$1 = new RestAppConfigService$getReportLinks$1(this, cVar);
        Object obj2 = restAppConfigService$getReportLinks$1.result;
        i10 = restAppConfigService$getReportLinks$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new h(2));
    }

    @Override // io.elevenlabs.domain.services.AppConfigService
    public ir.i sync() {
        return r.j(new RestAppConfigService$sync$1(this, null));
    }
}
