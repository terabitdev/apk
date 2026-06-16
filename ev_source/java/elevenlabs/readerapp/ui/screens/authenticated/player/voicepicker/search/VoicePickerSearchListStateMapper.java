package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ig.f;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListStateMapper;", "", "stringProvider", "Lio/elevenlabs/domain/StringProvider;", "<init>", "(Lio/elevenlabs/domain/StringProvider;)V", "mapState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$UiState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/search/VoicePickerSearchListContract$State;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerSearchListStateMapper {
    public static final int $stable = 8;
    private final StringProvider stringProvider;

    public VoicePickerSearchListStateMapper(StringProvider stringProvider) {
        stringProvider.getClass();
        this.stringProvider = stringProvider;
    }

    public final VoicePickerSearchListContract.UiState mapState(VoicePickerSearchListContract.State state) {
        state.getClass();
        un.b o6 = f.o();
        if (!state.getFavoriteVoices().isEmpty()) {
            o6.add(new ExploreVoiceSections.Section.VoiceList(this.stringProvider.getString(R.string.player_voice_picker_favorites), state.getFavoriteVoices()));
        }
        if (!state.getDefaultVoices().isEmpty()) {
            o6.add(new ExploreVoiceSections.Section.VoiceList(this.stringProvider.getString(R.string.player_voice_picker_tab_default), state.getDefaultVoices()));
        }
        if (!state.getCommunityVoices().getItems().isEmpty()) {
            o6.add(new ExploreVoiceSections.Section.VoiceList(this.stringProvider.getString(R.string.player_voice_picker_community_voices), state.getCommunityVoices().getItems()));
        }
        un.b i10 = f.i(o6);
        if (!i10.isEmpty()) {
            return new VoicePickerSearchListContract.UiState.Data(i10, state.isLoading());
        }
        if (state.isLoading()) {
            return VoicePickerSearchListContract.UiState.Loading.INSTANCE;
        }
        String searchQuery = state.getSearchQuery();
        if (searchQuery != null && !n.m0(searchQuery)) {
            return VoicePickerSearchListContract.UiState.Empty.INSTANCE;
        }
        return VoicePickerSearchListContract.UiState.Initial.INSTANCE;
    }
}
