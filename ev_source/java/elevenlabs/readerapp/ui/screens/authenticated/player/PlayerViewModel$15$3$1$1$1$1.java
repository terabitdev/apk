package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.ReadsService;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$15$3$1$1$1$1", f = "PlayerViewModel.kt", l = {418}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$15$3$1$1$1$1 extends yn.i implements ho.p {
    final /* synthetic */ String $file;
    final /* synthetic */ ReadMeta $readMeta;
    final /* synthetic */ double $seconds;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$15$3$1$1$1$1(PlayerViewModel playerViewModel, ReadMeta readMeta, String str, double d10, wn.c<? super PlayerViewModel$15$3$1$1$1$1> cVar) {
        super(2, cVar);
        this.this$0 = playerViewModel;
        this.$readMeta = readMeta;
        this.$file = str;
        this.$seconds = d10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$15$3$1$1$1$1(this.this$0, this.$readMeta, this.$file, this.$seconds, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$15$3$1$1$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        PlayerViewModel$15$3$1$1$1$1 playerViewModel$15$3$1$1$1$1;
        Exception exc;
        ReadsService readsService;
        String readId;
        String str;
        double d10;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                try {
                    sn.a.g(obj);
                } catch (Exception e10) {
                    exc = e10;
                    playerViewModel$15$3$1$1$1$1 = this;
                    ib.i.r("Failed to persist audio position on TTS→audio swap: ", exc.getMessage(), playerViewModel$15$3$1$1$1$1.this$0.logger, playerViewModel$15$3$1$1$1$1.this$0.tag);
                    return sn.z.f31622a;
                }
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            try {
                readsService = (ReadsService) this.this$0.readsService.get();
                readId = this.$readMeta.getReadId();
                str = this.$file;
                d10 = this.$seconds;
                this.label = 1;
                playerViewModel$15$3$1$1$1$1 = this;
            } catch (Exception e11) {
                e = e11;
                playerViewModel$15$3$1$1$1$1 = this;
            }
            try {
                Object updateAudioPosition = readsService.updateAudioPosition(readId, str, d10, playerViewModel$15$3$1$1$1$1);
                xn.a aVar = xn.a.f37986a;
                if (updateAudioPosition == aVar) {
                    return aVar;
                }
            } catch (Exception e12) {
                e = e12;
                exc = e;
                ib.i.r("Failed to persist audio position on TTS→audio swap: ", exc.getMessage(), playerViewModel$15$3$1$1$1$1.this$0.logger, playerViewModel$15$3$1$1$1$1.this$0.tag);
                return sn.z.f31622a;
            }
        }
        return sn.z.f31622a;
    }
}
