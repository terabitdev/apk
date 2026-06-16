package io.elevenlabs.player;

import ae.l;
import android.os.Bundle;
import com.google.protobuf.c6;
import fr.d0;
import ho.p;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.player.BackgroundPlayerAction;
import ir.j1;
import ja.g4;
import ja.k4;
import ja.z;
import java.io.File;
import kotlin.Metadata;
import lh.b0;
import t2.u;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.player.BackgroundPlayerControllerService$setSoundscape$2", f = "BackgroundPlayerControllerService.kt", l = {476, 479, 480, 481}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class BackgroundPlayerControllerService$setSoundscape$2 extends i implements p {
    final /* synthetic */ z $controller;
    final /* synthetic */ File $file;
    final /* synthetic */ String $id;
    final /* synthetic */ float $mixingLevel;
    Object L$0;
    int label;
    final /* synthetic */ BackgroundPlayerControllerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayerControllerService$setSoundscape$2(z zVar, BackgroundPlayerControllerService backgroundPlayerControllerService, String str, File file, float f10, wn.c<? super BackgroundPlayerControllerService$setSoundscape$2> cVar) {
        super(2, cVar);
        this.$controller = zVar;
        this.this$0 = backgroundPlayerControllerService;
        this.$id = str;
        this.$file = file;
        this.$mixingLevel = f10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new BackgroundPlayerControllerService$setSoundscape$2(this.$controller, this.this$0, this.$id, this.$file, this.$mixingLevel, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((BackgroundPlayerControllerService$setSoundscape$2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00eb, code lost:
    
        if (r11.emit(r2, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ed, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cc, code lost:
    
        if (r11.emit(r0, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        if (r11.emit(r0, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r11 == r6) goto L31;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Logger logger;
        String str2;
        j1 j1Var;
        j1 j1Var2;
        j1 j1Var3;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            sn.a.g(obj);
                            return sn.z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                    j1Var3 = this.this$0.currentSoundscapeMixingLevelState;
                    Float f10 = new Float(l.l(this.$mixingLevel, u.P, 1.0f));
                    this.L$0 = null;
                    this.label = 4;
                } else {
                    sn.a.g(obj);
                    j1Var2 = this.this$0.currentSoundscapeFileState;
                    File file = this.$file;
                    this.L$0 = null;
                    this.label = 3;
                }
            } else {
                sn.a.g(obj);
            }
        } else {
            sn.a.g(obj);
            z zVar = this.$controller;
            Bundle o6 = kd.a.o();
            String str3 = this.$id;
            File file2 = this.$file;
            float f11 = this.$mixingLevel;
            ExchangeKt.setSoundscapeId(o6, str3);
            if (file2 != null) {
                str = file2.getAbsolutePath();
            } else {
                str = null;
            }
            ExchangeKt.setSoundscapeFile(o6, str);
            ExchangeKt.setSoundscapeMixingLevel(o6, new Float(f11));
            b0 e10 = zVar.e(new g4(o6, BackgroundPlayerAction.SetSoundscape.ACTION_ID), kd.a.o());
            e10.getClass();
            this.label = 1;
            obj = BackgroundPlayerControllerServiceKt.await(e10, this);
        }
        obj.getClass();
        k4 k4Var = (k4) obj;
        int i11 = k4Var.f19044a;
        logger = this.this$0.logger;
        str2 = this.this$0.tag;
        logger.log(str2, "Set soundscape result " + i11 + " / " + k4Var.f19047d);
        if (i11 == 0) {
            j1Var = this.this$0.currentSoundscapeIdState;
            String str4 = this.$id;
            this.L$0 = null;
            this.label = 2;
        }
        return sn.z.f31622a;
    }
}
