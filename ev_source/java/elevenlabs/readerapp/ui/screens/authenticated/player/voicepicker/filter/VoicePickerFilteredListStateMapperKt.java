package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.VoicePickerFilteredListContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toUiState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$UiState;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/filter/VoicePickerFilteredListContract$State;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerFilteredListStateMapperKt {
    public static final VoicePickerFilteredListContract.UiState toUiState(VoicePickerFilteredListContract.State state) {
        state.getClass();
        if (!state.getItems().isEmpty()) {
            return new VoicePickerFilteredListContract.UiState.Data(state.getItems(), state.isLoading());
        }
        String error = state.getError();
        if (error != null && !n.m0(error)) {
            return new VoicePickerFilteredListContract.UiState.Error(state.getError());
        }
        if (state.isLoading()) {
            return VoicePickerFilteredListContract.UiState.Loading.INSTANCE;
        }
        return VoicePickerFilteredListContract.UiState.Empty.INSTANCE;
    }
}
