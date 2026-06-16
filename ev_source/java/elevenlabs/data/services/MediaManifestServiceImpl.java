package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import io.elevenlabs.data.api.HlsManifestResponse;
import io.elevenlabs.data.api.MediaAPI;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.domain.exceptions.ApiExceptionFactoryKt;
import io.elevenlabs.domain.services.MediaManifestService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/data/services/MediaManifestServiceImpl;", "Lio/elevenlabs/domain/services/MediaManifestService;", "Lio/elevenlabs/data/api/MediaAPI;", "mediaAPI", "<init>", "(Lio/elevenlabs/data/api/MediaAPI;)V", "", "readId", "fileNumber", "getHlsManifestUrl", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/api/MediaAPI;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaManifestServiceImpl implements MediaManifestService {
    private final MediaAPI mediaAPI;

    public MediaManifestServiceImpl(MediaAPI mediaAPI) {
        mediaAPI.getClass();
        this.mediaAPI = mediaAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.MediaManifestService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getHlsManifestUrl(String str, String str2, wn.c<? super String> cVar) {
        MediaManifestServiceImpl$getHlsManifestUrl$1 mediaManifestServiceImpl$getHlsManifestUrl$1;
        int i10;
        ApiResult apiResult;
        if (cVar instanceof MediaManifestServiceImpl$getHlsManifestUrl$1) {
            mediaManifestServiceImpl$getHlsManifestUrl$1 = (MediaManifestServiceImpl$getHlsManifestUrl$1) cVar;
            int i11 = mediaManifestServiceImpl$getHlsManifestUrl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mediaManifestServiceImpl$getHlsManifestUrl$1.label = i11 - Integer.MIN_VALUE;
                Object obj = mediaManifestServiceImpl$getHlsManifestUrl$1.result;
                i10 = mediaManifestServiceImpl$getHlsManifestUrl$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    MediaAPI mediaAPI = this.mediaAPI;
                    mediaManifestServiceImpl$getHlsManifestUrl$1.L$0 = null;
                    mediaManifestServiceImpl$getHlsManifestUrl$1.L$1 = null;
                    mediaManifestServiceImpl$getHlsManifestUrl$1.label = 1;
                    obj = mediaAPI.getHlsManifestUrl(str, str2, mediaManifestServiceImpl$getHlsManifestUrl$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return ((HlsManifestResponse) ((ApiResult.Success) apiResult).getData()).getHlsManifestUrl();
                }
                if (!(apiResult instanceof ApiResult.Error.ApiError)) {
                    if (!(apiResult instanceof ApiResult.Error.NetworkError)) {
                        if (apiResult instanceof ApiResult.Error.UnknownError) {
                            c6.z(defpackage.f.i("Unknown error: ", ((ApiResult.Error.UnknownError) apiResult).getMessage()));
                            return null;
                        }
                        c6.p();
                        return null;
                    }
                    c6.z("Network error");
                    return null;
                }
                ApiResult.Error.ApiError apiError = (ApiResult.Error.ApiError) apiResult;
                throw ApiExceptionFactoryKt.apiExceptionFor(apiError.getCode(), apiError.getMessage());
            }
        }
        mediaManifestServiceImpl$getHlsManifestUrl$1 = new MediaManifestServiceImpl$getHlsManifestUrl$1(this, cVar);
        Object obj2 = mediaManifestServiceImpl$getHlsManifestUrl$1.result;
        i10 = mediaManifestServiceImpl$getHlsManifestUrl$1.label;
        if (i10 == 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }
}
