package io.elevenlabs.data.api;

import ct.f;
import ct.s;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/DrmAPI;", "", "", "readId", "fileNumber", "deviceId", "licenseType", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/api/DrmTokenResponse;", "getDrmToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface DrmAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getDrmToken$default(DrmAPI drmAPI, String str, String str2, String str3, String str4, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                str4 = "streaming";
            }
            return drmAPI.getDrmToken(str, str2, str3, str4, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getDrmToken");
        return null;
    }

    @f("/v1/reader/reads/{read_id}/drm-token")
    Object getDrmToken(@s("read_id") String str, @t("file_number") String str2, @t("device_id") String str3, @t("license_type") String str4, c<? super ApiResult<DrmTokenResponse>> cVar);
}
