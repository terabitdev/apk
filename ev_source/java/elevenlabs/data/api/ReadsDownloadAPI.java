package io.elevenlabs.data.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import ct.i;
import ct.o;
import ct.s;
import ct.t;
import ct.w;
import io.elevenlabs.data.model.ApiResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.ResponseBody;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JL\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ReadsDownloadAPI;", "", "", "readId", "voiceId", "appCheckToken", "", FirebaseAnalytics.Param.INDEX, "chapterIndex", "Lio/elevenlabs/data/model/ApiResult;", "Lokhttp3/ResponseBody;", "downloadRead", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ReadsDownloadAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object downloadRead$default(ReadsDownloadAPI readsDownloadAPI, String str, String str2, String str3, int i10, Integer num, c cVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 8) != 0) {
                i10 = 0;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                num = null;
            }
            return readsDownloadAPI.downloadRead(str, str2, str3, i12, num, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: downloadRead");
        return null;
    }

    @o("/v1/reader/reads/{read_id}/download/{voice_id}")
    @w
    Object downloadRead(@s("read_id") String str, @s("voice_id") String str2, @i("xi-app-check-token") String str3, @t("index") int i10, @t("chapter_index") Integer num, c<? super ApiResult<ResponseBody>> cVar);
}
