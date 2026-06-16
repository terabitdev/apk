package io.elevenlabs.domain.usecase;

import io.elevenlabs.domain.model.ReadMeta;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0086\u0002R\u0018\u0010\n\u001a\u00020\u0005*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/usecase/IsScreenRecordingAllowedUseCase;", "", "<init>", "()V", "invoke", "", "readMeta", "Lio/elevenlabs/domain/model/ReadMeta;", "isPaidPlanUser", "paidUsersFeatureFlagEnabled", "requiresScreenRecordingProtection", "getRequiresScreenRecordingProtection", "(Lio/elevenlabs/domain/model/ReadMeta;)Z", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class IsScreenRecordingAllowedUseCase {
    private final boolean getRequiresScreenRecordingProtection(ReadMeta readMeta) {
        if (!readMeta.isPaid() && readMeta.getAndroidProductId() == null && !readMeta.getUseDrm()) {
            return false;
        }
        return true;
    }

    public final boolean invoke(ReadMeta readMeta, boolean isPaidPlanUser, boolean paidUsersFeatureFlagEnabled) {
        if (!paidUsersFeatureFlagEnabled || !isPaidPlanUser || readMeta == null) {
            return false;
        }
        return !getRequiresScreenRecordingProtection(readMeta);
    }
}
