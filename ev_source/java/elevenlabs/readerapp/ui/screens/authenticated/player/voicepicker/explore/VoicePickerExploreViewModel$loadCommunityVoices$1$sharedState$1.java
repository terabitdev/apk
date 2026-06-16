package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore.VoicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1", f = "VoicePickerExploreViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;"}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1 extends yn.i implements p {
    /* synthetic */ Object L$0;
    int label;

    public VoicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1(wn.c<? super VoicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1> cVar) {
        super(2, cVar);
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        VoicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1 voicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1 = new VoicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1(cVar);
        voicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1.L$0 = obj;
        return voicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1;
    }

    @Override // ho.p
    public final Object invoke(VoicePickerSharedContract.State state, wn.c<? super Boolean> cVar) {
        return ((VoicePickerExploreViewModel$loadCommunityVoices$1$sharedState$1) create(state, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        VoicePickerSharedContract.State state = (VoicePickerSharedContract.State) this.L$0;
        if (this.label == 0) {
            sn.a.g(obj);
            return Boolean.valueOf(!(state.getReadMeta() instanceof VoicePickerSharedContract.ReadMetaState.Initial));
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
