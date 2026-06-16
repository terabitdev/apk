package io.elevenlabs.domain.exceptions;

import io.elevenlabs.domain.ApiException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/domain/exceptions/SubscriptionRequiredException;", "Lio/elevenlabs/domain/ApiException;", "message", "", "<init>", "(Ljava/lang/String;)V", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SubscriptionRequiredException extends ApiException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionRequiredException(String str) {
        super("subscription_required", str, null, 4, null);
        str.getClass();
    }
}
