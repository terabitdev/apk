package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.AsyncCallResult;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/GooglePlayService;", "", "", "readId", "purchaseToken", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lsn/z;", "confirmPurchaseReadToken", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "orderId", "signature", "postPurchaseReadToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface GooglePlayService {
    Object confirmPurchaseReadToken(String str, String str2, c<? super AsyncCallResult<z>> cVar);

    Object postPurchaseReadToken(String str, String str2, String str3, String str4, c<? super AsyncCallResult<z>> cVar);
}
