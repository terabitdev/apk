package io.elevenlabs.data.api;

import ct.f;
import ct.t;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.OneTimeProductsPageResponseV2;
import io.livekit.android.room.SignalClient;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/ProductsAPI;", "", "", "Lio/elevenlabs/data/model/ProductPlatform;", "targetPlatform", "context", "Lio/elevenlabs/data/model/ApiResult;", "Lio/elevenlabs/data/model/response/OneTimeProductsPageResponseV2;", "getOneTimeProductsPage", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "getLowHoursProductsPage", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ProductsAPI {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getLowHoursProductsPage$default(ProductsAPI productsAPI, String str, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = SignalClient.SDK_TYPE;
            }
            return productsAPI.getLowHoursProductsPage(str, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getLowHoursProductsPage");
        return null;
    }

    static /* synthetic */ Object getOneTimeProductsPage$default(ProductsAPI productsAPI, String str, String str2, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = SignalClient.SDK_TYPE;
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return productsAPI.getOneTimeProductsPage(str, str2, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getOneTimeProductsPage");
        return null;
    }

    @f("/v1/reader/products/low-hours-page")
    Object getLowHoursProductsPage(@t("target_platform") String str, c<? super ApiResult<OneTimeProductsPageResponseV2>> cVar);

    @f("/v1/reader/products/one-time-page/v2")
    Object getOneTimeProductsPage(@t("target_platform") String str, @t("context") String str2, c<? super ApiResult<OneTimeProductsPageResponseV2>> cVar);
}
