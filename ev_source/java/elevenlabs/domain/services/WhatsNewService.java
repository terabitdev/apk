package io.elevenlabs.domain.services;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/WhatsNewService;", "", "", "shouldShowWhatsNew", "()Z", "Lsn/z;", "onWhatsNewShown", "()V", "delayUntilNextSession", "onNewSession", "reset", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface WhatsNewService {
    void delayUntilNextSession();

    void onNewSession();

    void onWhatsNewShown();

    void reset();

    boolean shouldShowWhatsNew();
}
