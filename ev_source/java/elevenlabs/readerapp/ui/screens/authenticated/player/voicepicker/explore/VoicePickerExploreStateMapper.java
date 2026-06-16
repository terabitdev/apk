package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ExploreVoiceSections;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.VoicePickerVoiceKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J.\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreStateMapper;", "", "stringProvider", "Lio/elevenlabs/domain/StringProvider;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "<init>", "(Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;)V", "mapState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$UiState;", "uiState", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/explore/VoicePickerExploreContract$State;", "sharedState", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "buildPrioritySections", "", "Lio/elevenlabs/domain/model/ExploreVoiceSections$Section;", "readMeta", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$ReadMetaState$Present;", "finaliseSectionsState", "initialSections", "canChangeVoices", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerExploreStateMapper {
    public static final int $stable = 8;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final StringProvider stringProvider;

    public VoicePickerExploreStateMapper(StringProvider stringProvider, ResolveErrorMessageUseCase resolveErrorMessageUseCase) {
        stringProvider.getClass();
        resolveErrorMessageUseCase.getClass();
        this.stringProvider = stringProvider;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
    }

    private final List<ExploreVoiceSections.Section> buildPrioritySections(VoicePickerExploreContract.State state, VoicePickerSharedContract.ReadMetaState.Present readMeta) {
        List list;
        List<Voice> allVoices = state.getAllVoices();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = allVoices.iterator();
        while (true) {
            list = null;
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String voiceId = ((Voice) next).getVoiceId();
            OfflineReadData offlineReadData = readMeta.getValue().getOfflineReadData();
            if (offlineReadData != null) {
                str = offlineReadData.getVoiceId();
            }
            if (m.c(voiceId, str)) {
                arrayList.add(next);
            }
        }
        ReadMeta value = readMeta.getValue();
        if (!ReadMetaKt.getShouldShowOriginalAudio(value)) {
            value = null;
        }
        if (value != null) {
            list = ig.f.H(VoicePickerVoiceKt.originalAudioVoice(this.stringProvider));
        }
        if (list == null) {
            list = t.f33547a;
        }
        un.b o6 = ig.f.o();
        if (!arrayList.isEmpty()) {
            o6.add(new ExploreVoiceSections.Section.VoiceList(this.stringProvider.getString(R.string.player_voice_picker_offline_title), arrayList));
        }
        if (!list.isEmpty()) {
            o6.add(new ExploreVoiceSections.Section.VoiceList(this.stringProvider.getString(R.string.player_voice_picker_original_audio_section_title), list));
        }
        return ig.f.i(o6);
    }

    private final VoicePickerExploreContract.UiState finaliseSectionsState(VoicePickerExploreContract.UiState uiState, VoicePickerExploreContract.State state, List<? extends ExploreVoiceSections.Section> initialSections, boolean canChangeVoices) {
        un.b o6 = ig.f.o();
        o6.addAll(initialSections);
        if (canChangeVoices) {
            VoicePickerExploreContract.RecommendedVoicesState recommendedVoices = state.getRecommendedVoices();
            if (!(recommendedVoices instanceof VoicePickerExploreContract.RecommendedVoicesState.Initial) && !(recommendedVoices instanceof VoicePickerExploreContract.RecommendedVoicesState.Loading)) {
                if (recommendedVoices instanceof VoicePickerExploreContract.RecommendedVoicesState.Loaded) {
                    if (((VoicePickerExploreContract.RecommendedVoicesState.Loaded) state.getRecommendedVoices()).getResult() instanceof AsyncCallResult.Success) {
                        o6.addAll(((ExploreVoiceSections) ((AsyncCallResult.Success) ((VoicePickerExploreContract.RecommendedVoicesState.Loaded) state.getRecommendedVoices()).getResult()).getData()).getSections());
                        if (!state.getCommunityVoices().getItems().isEmpty()) {
                            o6.add(new ExploreVoiceSections.Section.VoiceList(this.stringProvider.getString(R.string.player_voice_picker_community_voices), state.getCommunityVoices().getItems()));
                        }
                    }
                } else {
                    c6.p();
                    return null;
                }
            }
        }
        un.b i10 = ig.f.i(o6);
        if (!i10.isEmpty()) {
            return new VoicePickerExploreContract.UiState.Data(i10, state.getCommunityVoices().isLoading());
        }
        VoicePickerExploreContract.RecommendedVoicesState recommendedVoices2 = state.getRecommendedVoices();
        if (recommendedVoices2 instanceof VoicePickerExploreContract.RecommendedVoicesState.Initial) {
            return VoicePickerExploreContract.UiState.Loading.INSTANCE;
        }
        if (recommendedVoices2 instanceof VoicePickerExploreContract.RecommendedVoicesState.Loading) {
            return VoicePickerExploreContract.UiState.Loading.INSTANCE;
        }
        if (recommendedVoices2 instanceof VoicePickerExploreContract.RecommendedVoicesState.Loaded) {
            if (((VoicePickerExploreContract.RecommendedVoicesState.Loaded) state.getRecommendedVoices()).getResult() instanceof AsyncCallResult.Error) {
                if (uiState instanceof VoicePickerExploreContract.UiState.Data) {
                    if (!((VoicePickerExploreContract.UiState.Data) uiState).getSections().isEmpty()) {
                        return uiState;
                    }
                    return new VoicePickerExploreContract.UiState.Error(ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, (AsyncCallResult.Error) ((VoicePickerExploreContract.RecommendedVoicesState.Loaded) state.getRecommendedVoices()).getResult(), null, 2, null));
                }
                if (!(uiState instanceof VoicePickerExploreContract.UiState.Error) && !(uiState instanceof VoicePickerExploreContract.UiState.Loading)) {
                    c6.p();
                    return null;
                }
                return new VoicePickerExploreContract.UiState.Error(ResolveErrorMessageUseCase.invoke$default(this.resolveErrorMessageUseCase, (AsyncCallResult.Error) ((VoicePickerExploreContract.RecommendedVoicesState.Loaded) state.getRecommendedVoices()).getResult(), null, 2, null));
            }
            return uiState;
        }
        c6.p();
        return null;
    }

    public final VoicePickerExploreContract.UiState mapState(VoicePickerExploreContract.UiState uiState, VoicePickerExploreContract.State state, VoicePickerSharedContract.State sharedState) {
        uiState.getClass();
        state.getClass();
        sharedState.getClass();
        VoicePickerSharedContract.ReadMetaState readMeta = sharedState.getReadMeta();
        if (readMeta instanceof VoicePickerSharedContract.ReadMetaState.Initial) {
            return VoicePickerExploreContract.UiState.Loading.INSTANCE;
        }
        if (readMeta instanceof VoicePickerSharedContract.ReadMetaState.Absent) {
            return finaliseSectionsState(uiState, state, t.f33547a, true);
        }
        if (readMeta instanceof VoicePickerSharedContract.ReadMetaState.Present) {
            return finaliseSectionsState(uiState, state, buildPrioritySections(state, (VoicePickerSharedContract.ReadMetaState.Present) readMeta), sharedState.canChangeVoices());
        }
        c6.p();
        return null;
    }
}
