package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.domain.services.player.PlayerService;
import java.io.File;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel$saveAndClose$1$1", f = "SoundscapesViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SoundscapesViewModel$saveAndClose$1$1 extends yn.i implements p {
    final /* synthetic */ float $level;
    final /* synthetic */ Soundscape $selected;
    final /* synthetic */ File $selectedFile;
    int label;
    final /* synthetic */ SoundscapesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundscapesViewModel$saveAndClose$1$1(SoundscapesViewModel soundscapesViewModel, Soundscape soundscape, File file, float f10, wn.c<? super SoundscapesViewModel$saveAndClose$1$1> cVar) {
        super(2, cVar);
        this.this$0 = soundscapesViewModel;
        this.$selected = soundscape;
        this.$selectedFile = file;
        this.$level = f10;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new SoundscapesViewModel$saveAndClose$1$1(this.this$0, this.$selected, this.$selectedFile, this.$level, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((SoundscapesViewModel$saveAndClose$1$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        PlayerService playerService;
        String str;
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
            playerService = this.this$0.playerService;
            Soundscape soundscape = this.$selected;
            if (soundscape != null) {
                str = soundscape.getId();
            } else {
                str = null;
            }
            File file = this.$selectedFile;
            float f10 = this.$level;
            this.label = 1;
            Object soundscape2 = playerService.setSoundscape(str, file, f10, this);
            xn.a aVar = xn.a.f37986a;
            if (soundscape2 == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
