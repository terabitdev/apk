package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/DownloadAction;", "", "<init>", "(Ljava/lang/String;I)V", "DOWNLOAD", "REMOVE_DOWNLOAD", "CANCEL_DOWNLOAD", "RETRY_DOWNLOAD", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DownloadAction {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ DownloadAction[] $VALUES;
    public static final DownloadAction DOWNLOAD = new DownloadAction("DOWNLOAD", 0);
    public static final DownloadAction REMOVE_DOWNLOAD = new DownloadAction("REMOVE_DOWNLOAD", 1);
    public static final DownloadAction CANCEL_DOWNLOAD = new DownloadAction("CANCEL_DOWNLOAD", 2);
    public static final DownloadAction RETRY_DOWNLOAD = new DownloadAction("RETRY_DOWNLOAD", 3);

    private static final /* synthetic */ DownloadAction[] $values() {
        return new DownloadAction[]{DOWNLOAD, REMOVE_DOWNLOAD, CANCEL_DOWNLOAD, RETRY_DOWNLOAD};
    }

    static {
        DownloadAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rd.c1.q($values);
    }

    private DownloadAction(String str, int i10) {
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static DownloadAction valueOf(String str) {
        return (DownloadAction) Enum.valueOf(DownloadAction.class, str);
    }

    public static DownloadAction[] values() {
        return (DownloadAction[]) $VALUES.clone();
    }
}
