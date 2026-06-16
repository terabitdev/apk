package io.elevenlabs.data.api;

import ct.f;
import ct.o;
import ct.s;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.GooglePlayPurchaseReadTokenRequest;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/api/GooglePlayAPI;", "", "", "readId", "purchaseToken", "Lio/elevenlabs/data/model/ApiResult;", "Lsn/z;", "confirmPurchaseReadToken", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/model/request/GooglePlayPurchaseReadTokenRequest;", "googlePlayPurchaseReadTokenRequest", "postPurchaseReadToken", "(Ljava/lang/String;Lio/elevenlabs/data/model/request/GooglePlayPurchaseReadTokenRequest;Lwn/c;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface GooglePlayAPI {
    @f("/v1/reader/google-play/purchase-read-token/{read_id}/{purchase_token}")
    Object confirmPurchaseReadToken(@s("read_id") String str, @s("purchase_token") String str2, c<? super ApiResult<z>> cVar);

    @o("/v1/reader/google-play/purchase-read-token/{read_id}")
    Object postPurchaseReadToken(@s("read_id") String str, @ct.a GooglePlayPurchaseReadTokenRequest googlePlayPurchaseReadTokenRequest, c<? super ApiResult<z>> cVar);
}
