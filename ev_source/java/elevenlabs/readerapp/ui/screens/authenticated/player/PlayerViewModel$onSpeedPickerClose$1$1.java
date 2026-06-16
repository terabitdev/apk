package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.UserConfigRequest;
import io.elevenlabs.domain.services.UserConfigService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$onSpeedPickerClose$1$1", f = "PlayerViewModel.kt", l = {1847}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$onSpeedPickerClose$1$1 extends yn.i implements ho.p {
    final /* synthetic */ PlayerState $this_queueStateUpdate;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$onSpeedPickerClose$1$1(PlayerViewModel playerViewModel, PlayerState playerState, wn.c<? super PlayerViewModel$onSpeedPickerClose$1$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$this_queueStateUpdate = playerState;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$onSpeedPickerClose$1$1(this.this$0, this.$this_queueStateUpdate, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$onSpeedPickerClose$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            UserConfigService userConfigService = this.this$0.userConfigService;
            UserConfigRequest userConfigRequest = new UserConfigRequest(null, this.$this_queueStateUpdate.getPlayer().getPlaybackSpeed(), null, null, null, null, null, null, null, null, null, 2045, null);
            this.label = 1;
            Object saveAsync = userConfigService.saveAsync(userConfigRequest, this);
            xn.a aVar = xn.a.f37986a;
            if (saveAsync == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
