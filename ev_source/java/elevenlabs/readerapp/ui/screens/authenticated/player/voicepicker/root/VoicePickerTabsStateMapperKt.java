package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root;

import com.google.protobuf.c6;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"mapVoicePickerTabs", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/root/VoicePickerContract$TabsState;", "isConnected", "", "sharedState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "tabs", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerTabsStateMapperKt {
    public static final VoicePickerContract.TabsState mapVoicePickerTabs(boolean z6, VoicePickerSharedContract.State state, VoicePickerContract.TabsState tabsState) {
        boolean z10;
        VoicePickerTab voicePickerTab;
        state.getClass();
        tabsState.getClass();
        VoicePickerSharedContract.ReadMetaState readMeta = state.getReadMeta();
        boolean z11 = true;
        if (readMeta instanceof VoicePickerSharedContract.ReadMetaState.Initial) {
            z10 = state.getMode() instanceof VoicePickerMode.VoicePicker;
        } else {
            if (!(readMeta instanceof VoicePickerSharedContract.ReadMetaState.Absent)) {
                if (readMeta instanceof VoicePickerSharedContract.ReadMetaState.Present) {
                    if (!state.canShowAllVoiceTabs()) {
                        z10 = true;
                    }
                } else {
                    c6.p();
                    return null;
                }
            }
            z10 = false;
        }
        if (!z10 && (z6 || !(state.getMode() instanceof VoicePickerMode.VoicePicker))) {
            z11 = false;
        }
        if (z11) {
            return VoicePickerContract.TabsState.Hidden.INSTANCE;
        }
        if (tabsState instanceof VoicePickerContract.TabsState.Visible) {
            voicePickerTab = ((VoicePickerContract.TabsState.Visible) tabsState).getActiveTab();
        } else if (tabsState instanceof VoicePickerContract.TabsState.Hidden) {
            voicePickerTab = VoicePickerTab.Explore;
        } else {
            c6.p();
            return null;
        }
        return new VoicePickerContract.TabsState.Visible(voicePickerTab, o.g1(VoicePickerTab.getEntries()));
    }
}
