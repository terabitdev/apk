package io.elevenlabs.data.services.optimized;

import com.google.protobuf.c6;
import ho.p;
import kotlin.Metadata;
import sn.z;
import vq.j;
import wn.c;
import wq.n;
import xn.a;
import yn.e;
import yn.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.elevenlabs.data.services.optimized.OptimizedReadSplitter$chunkBySpanClose$1", f = "OptimizedReadSplitter.kt", l = {125, 130}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvq/j;", "", "Lsn/z;", "<anonymous>", "(Lvq/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class OptimizedReadSplitter$chunkBySpanClose$1 extends h implements p {
    final /* synthetic */ String $line;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptimizedReadSplitter$chunkBySpanClose$1(String str, c<? super OptimizedReadSplitter$chunkBySpanClose$1> cVar) {
        super(2, cVar);
        this.$line = str;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        OptimizedReadSplitter$chunkBySpanClose$1 optimizedReadSplitter$chunkBySpanClose$1 = new OptimizedReadSplitter$chunkBySpanClose$1(this.$line, cVar);
        optimizedReadSplitter$chunkBySpanClose$1.L$0 = obj;
        return optimizedReadSplitter$chunkBySpanClose$1;
    }

    @Override // ho.p
    public final Object invoke(j jVar, c<? super z> cVar) {
        return ((OptimizedReadSplitter$chunkBySpanClose$1) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        int i11;
        int i12;
        a aVar;
        int k02;
        j jVar = (j) this.L$0;
        int i13 = this.label;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    sn.a.g(obj);
                    return z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i11 = this.I$2;
            sn.a.g(obj);
            i10 = i11;
            i12 = 0;
        } else {
            sn.a.g(obj);
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        do {
            int length = this.$line.length();
            aVar = a.f37986a;
            if (i11 < length && (k02 = n.k0(this.$line, "</span>", i11, false, 4)) >= 0) {
                i12++;
                i11 = k02 + 7;
            } else {
                if (i10 < this.$line.length()) {
                    String substring = this.$line.substring(i10);
                    this.L$0 = null;
                    this.I$0 = i10;
                    this.I$1 = i12;
                    this.I$2 = i11;
                    this.label = 2;
                    jVar.b(substring, this);
                    return aVar;
                }
                return z.f31622a;
            }
        } while (i12 < 30);
        String substring2 = this.$line.substring(i10, i11);
        this.L$0 = jVar;
        this.I$0 = i10;
        this.I$1 = i12;
        this.I$2 = i11;
        this.I$3 = k02;
        this.label = 1;
        jVar.b(substring2, this);
        return aVar;
    }
}
