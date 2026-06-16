package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.services.player.AssistantTriggerEvent;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerScreenKt$PlayerScreenUI$9$1", f = "PlayerScreen.kt", l = {306}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerScreenKt$PlayerScreenUI$9$1 extends yn.i implements ho.p {
    final /* synthetic */ ho.l $action;
    final /* synthetic */ ir.i $assistantTriggerFlow;
    final /* synthetic */ u2.z0 $showAssistantSheet$delegate;
    final /* synthetic */ ir.z1 $state;
    final /* synthetic */ u2.z0 $wasPlayingBeforeAgent$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerScreenKt$PlayerScreenUI$9$1(ir.i iVar, ho.l lVar, ir.z1 z1Var, u2.z0 z0Var, u2.z0 z0Var2, wn.c<? super PlayerScreenKt$PlayerScreenUI$9$1> cVar) {
        super(2, cVar);
        this.$assistantTriggerFlow = iVar;
        this.$action = lVar;
        this.$state = z1Var;
        this.$showAssistantSheet$delegate = z0Var;
        this.$wasPlayingBeforeAgent$delegate = z0Var2;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerScreenKt$PlayerScreenUI$9$1(this.$assistantTriggerFlow, this.$action, this.$state, this.$showAssistantSheet$delegate, this.$wasPlayingBeforeAgent$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerScreenKt$PlayerScreenUI$9$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            ir.i iVar = this.$assistantTriggerFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$action, this.$state, this.$showAssistantSheet$delegate, this.$wasPlayingBeforeAgent$delegate);
            this.label = 1;
            Object collect = iVar.collect(anonymousClass1, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerScreenKt$PlayerScreenUI$9$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ ho.l $action;
        final /* synthetic */ u2.z0 $showAssistantSheet$delegate;
        final /* synthetic */ ir.z1 $state;
        final /* synthetic */ u2.z0 $wasPlayingBeforeAgent$delegate;

        public AnonymousClass1(ho.l lVar, ir.z1 z1Var, u2.z0 z0Var, u2.z0 z0Var2) {
            this.$action = lVar;
            this.$state = z1Var;
            this.$showAssistantSheet$delegate = z0Var;
            this.$wasPlayingBeforeAgent$delegate = z0Var2;
        }

        public static final sn.z emit$lambda$0(PlayerViewModel playerViewModel) {
            playerViewModel.getClass();
            playerViewModel.getAnalytics().log(new Analytics.Event.PlayerClickedVoiceChat(Analytics.Event.PlayerActionSource.MediaButton));
            return sn.z.f31622a;
        }

        public static final sn.z emit$lambda$1(PlayerViewModel playerViewModel) {
            playerViewModel.getClass();
            playerViewModel.onTogglePlayPause();
            return sn.z.f31622a;
        }

        public final Object emit(AssistantTriggerEvent assistantTriggerEvent, wn.c<? super sn.z> cVar) {
            boolean PlayerScreenUI$lambda$28;
            PlayerScreenUI$lambda$28 = PlayerScreenKt.PlayerScreenUI$lambda$28(this.$showAssistantSheet$delegate);
            if (!PlayerScreenUI$lambda$28) {
                this.$action.invoke(new i1(2));
                boolean isPlayingWhenReady = ((PlayerState) this.$state.getValue()).getPlayer().isPlayingWhenReady();
                PlayerScreenKt.PlayerScreenUI$lambda$32(this.$wasPlayingBeforeAgent$delegate, isPlayingWhenReady);
                if (isPlayingWhenReady) {
                    this.$action.invoke(new i1(3));
                }
                PlayerScreenKt.PlayerScreenUI$lambda$29(this.$showAssistantSheet$delegate, true);
            }
            return sn.z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((AssistantTriggerEvent) obj, (wn.c<? super sn.z>) cVar);
        }
    }
}
