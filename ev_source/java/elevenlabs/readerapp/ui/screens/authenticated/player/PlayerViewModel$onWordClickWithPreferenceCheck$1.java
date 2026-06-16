package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.EffectivePlaybackMode;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.domain.model.PlayerPreferences;
import io.elevenlabs.highlighter.WordTapTarget;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$onWordClickWithPreferenceCheck$1", f = "PlayerViewModel.kt", l = {1479, 1502}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$onWordClickWithPreferenceCheck$1 extends yn.i implements ho.p {
    final /* synthetic */ WordTapTarget $target;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$onWordClickWithPreferenceCheck$1(PlayerViewModel playerViewModel, WordTapTarget wordTapTarget, wn.c<? super PlayerViewModel$onWordClickWithPreferenceCheck$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$target = wordTapTarget;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$onWordClickWithPreferenceCheck$1(this.this$0, this.$target, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$onWordClickWithPreferenceCheck$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        if (r9 == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (r9 == r3) goto L27;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EffectivePlaybackMode effectivePlaybackMode;
        Object seekToAudioFileTime;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            ir.i preferences = this.this$0.playerPreferencesService.getPreferences();
            this.label = 1;
            obj = ir.r.u(preferences, this);
        }
        boolean controlsVisibleByUser = ((PlayerState) this.this$0.getStateFlow().getValue()).getControlsVisibleByUser();
        if (((PlayerPreferences) obj).getTapToShowControlsEnabled() && !controlsVisibleByUser) {
            this.this$0.showControls();
        } else {
            this.this$0.showControls();
            ContentState contentState = ((PlayerState) this.this$0.getStateFlow().getValue()).getContentState();
            if (contentState != null) {
                effectivePlaybackMode = EffectivePlaybackModeKt.effectivePlaybackMode(contentState.getReadMeta(), contentState.getUsedVoiceId());
            } else {
                effectivePlaybackMode = null;
            }
            Double timestampSeconds = this.$target.getTimestampSeconds();
            String audioFileNumber = this.$target.getAudioFileNumber();
            if (effectivePlaybackMode == EffectivePlaybackMode.Audio && timestampSeconds != null && audioFileNumber != null) {
                PlayerViewModel playerViewModel = this.this$0;
                double doubleValue = timestampSeconds.doubleValue();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.Z$0 = controlsVisibleByUser;
                this.label = 2;
                seekToAudioFileTime = playerViewModel.seekToAudioFileTime(audioFileNumber, doubleValue, this);
            } else {
                this.this$0.seekToOffset(this.$target.getCharOffset());
            }
        }
        return sn.z.f31622a;
    }
}
