package io.elevenlabs.readerapp.ui.delegates;

import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.services.AudioPreviewService;
import ir.j1;
import kotlin.Metadata;
import sn.a;
import sn.z;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.readerapp.ui.delegates.AudioPreviewPlayback$toggle$1", f = "AudioPreviewPlayback.kt", l = {31}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class AudioPreviewPlayback$toggle$1 extends i implements p {
    final /* synthetic */ String $readId;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ AudioPreviewPlayback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioPreviewPlayback$toggle$1(AudioPreviewPlayback audioPreviewPlayback, String str, String str2, c<? super AudioPreviewPlayback$toggle$1> cVar) {
        super(2, cVar);
        this.this$0 = audioPreviewPlayback;
        this.$url = str;
        this.$readId = str2;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new AudioPreviewPlayback$toggle$1(this.this$0, this.$url, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super z> cVar) {
        return ((AudioPreviewPlayback$toggle$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        AudioPreviewService audioPreviewService;
        j1 j1Var;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            audioPreviewService = this.this$0.audioPreviewService;
            String str = this.$url;
            this.label = 1;
            Object play = audioPreviewService.play(str, this);
            xn.a aVar = xn.a.f37986a;
            if (play == aVar) {
                return aVar;
            }
        }
        j1Var = this.this$0._playingReadId;
        j1Var.compareAndSet(this.$readId, null);
        return z.f31622a;
    }
}
