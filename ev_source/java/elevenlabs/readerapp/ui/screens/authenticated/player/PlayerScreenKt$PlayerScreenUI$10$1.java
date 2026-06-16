package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerScreenKt$PlayerScreenUI$10$1", f = "PlayerScreen.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerScreenKt$PlayerScreenUI$10$1 extends yn.i implements ho.p {
    final /* synthetic */ ho.l $action;
    final /* synthetic */ boolean $showAssistantOnLaunch;
    final /* synthetic */ u2.z0 $showAssistantSheet$delegate;
    final /* synthetic */ ir.z1 $state;
    final /* synthetic */ u2.z0 $wasPlayingBeforeAgent$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerScreenKt$PlayerScreenUI$10$1(boolean z6, ho.l lVar, ir.z1 z1Var, u2.z0 z0Var, u2.z0 z0Var2, wn.c<? super PlayerScreenKt$PlayerScreenUI$10$1> cVar) {
        super(2, cVar);
        this.$showAssistantOnLaunch = z6;
        this.$action = lVar;
        this.$state = z1Var;
        this.$showAssistantSheet$delegate = z0Var;
        this.$wasPlayingBeforeAgent$delegate = z0Var2;
    }

    public static final sn.z invokeSuspend$lambda$0(PlayerViewModel playerViewModel) {
        playerViewModel.getAnalytics().log(new Analytics.Event.PlayerClickedVoiceChat(Analytics.Event.PlayerActionSource.MediaButton));
        return sn.z.f31622a;
    }

    public static final sn.z invokeSuspend$lambda$1(PlayerViewModel playerViewModel) {
        playerViewModel.onTogglePlayPause();
        return sn.z.f31622a;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerScreenKt$PlayerScreenUI$10$1(this.$showAssistantOnLaunch, this.$action, this.$state, this.$showAssistantSheet$delegate, this.$wasPlayingBeforeAgent$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerScreenKt$PlayerScreenUI$10$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        boolean PlayerScreenUI$lambda$28;
        if (this.label == 0) {
            sn.a.g(obj);
            if (this.$showAssistantOnLaunch) {
                PlayerScreenUI$lambda$28 = PlayerScreenKt.PlayerScreenUI$lambda$28(this.$showAssistantSheet$delegate);
                if (!PlayerScreenUI$lambda$28) {
                    this.$action.invoke(new i1(0));
                    boolean isPlayingWhenReady = ((PlayerState) this.$state.getValue()).getPlayer().isPlayingWhenReady();
                    PlayerScreenKt.PlayerScreenUI$lambda$32(this.$wasPlayingBeforeAgent$delegate, isPlayingWhenReady);
                    if (isPlayingWhenReady) {
                        this.$action.invoke(new i1(1));
                    }
                    PlayerScreenKt.PlayerScreenUI$lambda$29(this.$showAssistantSheet$delegate, true);
                }
            }
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
