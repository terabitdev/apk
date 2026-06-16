package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/assistant/AssistantStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTED", "CONNECTING", "DISCONNECTED", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AssistantStatus {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ AssistantStatus[] $VALUES;
    public static final AssistantStatus CONNECTED = new AssistantStatus("CONNECTED", 0);
    public static final AssistantStatus CONNECTING = new AssistantStatus("CONNECTING", 1);
    public static final AssistantStatus DISCONNECTED = new AssistantStatus("DISCONNECTED", 2);

    private static final /* synthetic */ AssistantStatus[] $values() {
        return new AssistantStatus[]{CONNECTED, CONNECTING, DISCONNECTED};
    }

    static {
        AssistantStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private AssistantStatus(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static AssistantStatus valueOf(String str) {
        return (AssistantStatus) Enum.valueOf(AssistantStatus.class, str);
    }

    public static AssistantStatus[] values() {
        return (AssistantStatus[]) $VALUES.clone();
    }
}
