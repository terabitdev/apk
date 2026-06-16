package io.elevenlabs.readerapp.ui.screens.authenticated;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/DownloadsScreenState;", "", "<init>", "(Ljava/lang/String;I)V", "Loading", "Empty", "Content", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DownloadsScreenState {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ DownloadsScreenState[] $VALUES;
    public static final DownloadsScreenState Loading = new DownloadsScreenState("Loading", 0);
    public static final DownloadsScreenState Empty = new DownloadsScreenState("Empty", 1);
    public static final DownloadsScreenState Content = new DownloadsScreenState("Content", 2);

    private static final /* synthetic */ DownloadsScreenState[] $values() {
        return new DownloadsScreenState[]{Loading, Empty, Content};
    }

    static {
        DownloadsScreenState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rd.c1.q($values);
    }

    private DownloadsScreenState(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static DownloadsScreenState valueOf(String str) {
        return (DownloadsScreenState) Enum.valueOf(DownloadsScreenState.class, str);
    }

    public static DownloadsScreenState[] values() {
        return (DownloadsScreenState[]) $VALUES.clone();
    }
}
