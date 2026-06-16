package io.elevenlabs.player;

import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import ja.h1;
import ja.h2;
import ja.z1;
import java.io.File;
import kotlin.Metadata;
import sn.z;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerService$updateSoundscapeSessionExtras$1", f = "BackgroundPlayerService.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$updateSoundscapeSessionExtras$1 extends i implements p {
    final /* synthetic */ File $file;
    final /* synthetic */ String $id;
    final /* synthetic */ Float $mixingLevel;
    int label;
    final /* synthetic */ BackgroundPlayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerService$updateSoundscapeSessionExtras$1(BackgroundPlayerService backgroundPlayerService, String str, File file, Float f10, wn.c<? super BackgroundPlayerService$updateSoundscapeSessionExtras$1> cVar) {
        super(2, cVar);
        this.this$0 = backgroundPlayerService;
        this.$id = str;
        this.$file = file;
        this.$mixingLevel = f10;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerService$updateSoundscapeSessionExtras$1(this.this$0, this.$id, this.$file, this.$mixingLevel, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super z> cVar) {
        return ((BackgroundPlayerService$updateSoundscapeSessionExtras$1) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Bundle bundle;
        if (this.label == 0) {
            sn.a.g(obj);
            Bundle bundle2 = new Bundle();
            BackgroundPlayerService backgroundPlayerService = this.this$0;
            String str2 = this.$id;
            File file = this.$file;
            Float f10 = this.$mixingLevel;
            z1 z1Var = backgroundPlayerService.mediaSession;
            if (z1Var != null && (bundle = z1Var.f19331a.D) != null) {
                bundle2.putAll(bundle);
            }
            ExchangeKt.setSoundscapeId(bundle2, str2);
            if (file != null) {
                str = file.getAbsolutePath();
            } else {
                str = null;
            }
            ExchangeKt.setSoundscapeFile(bundle2, str);
            ExchangeKt.setSoundscapeMixingLevel(bundle2, f10);
            z1 z1Var2 = this.this$0.mediaSession;
            if (z1Var2 != null) {
                h2 h2Var = z1Var2.f19331a;
                Bundle bundle3 = new Bundle(bundle2);
                h2Var.D = bundle3;
                h2Var.e(new h1(bundle3));
            }
            return z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
