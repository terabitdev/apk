package io.elevenlabs.readerapp.core;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import ho.q;
import io.elevenlabs.domain.services.UserConfigService;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.core.ConfigViewModel$2$invokeSuspend$$inlined$flatMapLatest$1", f = "ConfigViewModel.kt", l = {190, 189}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {TokenNames.R, TokenNames.T, "Lir/j;", "it", "Lsn/z;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ConfigViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 extends yn.i implements q {
    final /* synthetic */ jl.a $userConfigService$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigViewModel$2$invokeSuspend$$inlined$flatMapLatest$1(wn.c cVar, jl.a aVar) {
        super(3, cVar);
        this.$userConfigService$inlined = aVar;
    }

    public final Object invoke(ir.j jVar, Boolean bool, wn.c<? super z> cVar) {
        ConfigViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 configViewModel$2$invokeSuspend$$inlined$flatMapLatest$1 = new ConfigViewModel$2$invokeSuspend$$inlined$flatMapLatest$1(cVar, this.$userConfigService$inlined);
        configViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = jVar;
        configViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = bool;
        return configViewModel$2$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (ir.r.r(r0, (ir.i) r7, r6) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r7 == r4) goto L18;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ir.j jVar;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = (ir.j) this.L$2;
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            jVar = (ir.j) this.L$0;
            boolean booleanValue = ((Boolean) this.L$1).booleanValue();
            if (booleanValue) {
                UserConfigService userConfigService = (UserConfigService) this.$userConfigService$inlined.get();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = jVar;
                this.L$3 = null;
                this.Z$0 = booleanValue;
                this.I$0 = 0;
                this.label = 1;
                obj = userConfigService.sync(this);
            } else {
                obj = ir.h.f17943a;
            }
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }

    @Override // ho.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ir.j) obj, (Boolean) obj2, (wn.c<? super z>) obj3);
    }
}
