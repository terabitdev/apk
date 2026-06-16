package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.readerapp.R;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerTab;", "", "title", "", ParameterNames.ICON, "<init>", "(Ljava/lang/String;III)V", "getTitle", "()I", "getIcon", "Explore", "Recents", "Favorites", "Created", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerTab {
    private static final /* synthetic */ zn.a $ENTRIES;
    private static final /* synthetic */ VoicePickerTab[] $VALUES;
    private final int icon;
    private final int title;
    public static final VoicePickerTab Explore = new VoicePickerTab("Explore", 0, R.string.player_voice_picker_explore, io.elevenlabs.ui.R.drawable.compass_round_filled);
    public static final VoicePickerTab Recents = new VoicePickerTab("Recents", 1, R.string.player_voice_picker_recents, io.elevenlabs.ui.R.drawable.clock_filled);
    public static final VoicePickerTab Favorites = new VoicePickerTab("Favorites", 2, R.string.player_voice_picker_favorites, io.elevenlabs.ui.R.drawable.heart_filled);
    public static final VoicePickerTab Created = new VoicePickerTab("Created", 3, R.string.player_voice_picker_created, io.elevenlabs.ui.R.drawable.color_palette__colours);

    private static final /* synthetic */ VoicePickerTab[] $values() {
        return new VoicePickerTab[]{Explore, Recents, Favorites, Created};
    }

    static {
        VoicePickerTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c1.q($values);
    }

    private VoicePickerTab(String str, int i10, int i11, int i12) {
        this.title = i11;
        this.icon = i12;
    }

    public static zn.a getEntries() {
        return $ENTRIES;
    }

    public static VoicePickerTab valueOf(String str) {
        return (VoicePickerTab) Enum.valueOf(VoicePickerTab.class, str);
    }

    public static VoicePickerTab[] values() {
        return (VoicePickerTab[]) $VALUES.clone();
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getTitle() {
        return this.title;
    }
}
