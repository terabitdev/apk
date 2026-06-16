package io.elevenlabs.data.api;

import ct.f;
import ct.o;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ReaderAppConfigResponseModel;
import io.elevenlabs.data.model.response.ReaderUserConfigResponseModel;
import io.elevenlabs.data.model.response.ReportLinksResponseModel;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ConfigAPI;", "", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;", "getAppConfig", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;", "getUserConfig", "request", "saveUserConfig", "(Lio/elevenlabs/data/model/response/ReaderUserConfigResponseModel;Lwn/c;)Ljava/lang/Object;", "", "readId", "Lio/elevenlabs/data/model/response/ReportLinksResponseModel;", "getReportLinks", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ConfigAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getReportLinks$default(ConfigAPI configAPI, String str, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return configAPI.getReportLinks(str, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getReportLinks");
        return null;
    }

    @f("/v1/reader/app_config")
    Object getAppConfig(c<? super ApiResult<ReaderAppConfigResponseModel>> cVar);

    @f("/v1/reader/report-links")
    Object getReportLinks(@t("read_id") String str, c<? super ApiResult<ReportLinksResponseModel>> cVar);

    @f("/v1/reader/user_config")
    Object getUserConfig(c<? super ApiResult<ReaderUserConfigResponseModel>> cVar);

    @o("/v1/reader/user_config")
    Object saveUserConfig(@ct.a ReaderUserConfigResponseModel readerUserConfigResponseModel, c<? super ApiResult<ReaderUserConfigResponseModel>> cVar);
}
