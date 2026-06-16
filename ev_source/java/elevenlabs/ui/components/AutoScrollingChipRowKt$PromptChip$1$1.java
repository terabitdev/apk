package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.AutoScrollingChipRowKt$PromptChip$1$1", f = "AutoScrollingChipRow.kt", l = {152}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AutoScrollingChipRowKt$PromptChip$1$1 extends yn.i implements ho.p {
    final /* synthetic */ p1.l $interactionSource;
    final /* synthetic */ ho.l $onPauseScrolling;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollingChipRowKt$PromptChip$1$1(p1.l lVar, ho.l lVar2, wn.c<? super AutoScrollingChipRowKt$PromptChip$1$1> cVar) {
        super(2, cVar);
        this.$interactionSource = lVar;
        this.$onPauseScrolling = lVar2;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AutoScrollingChipRowKt$PromptChip$1$1(this.$interactionSource, this.$onPauseScrolling, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AutoScrollingChipRowKt$PromptChip$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
                return sn.z.f31622a;
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sn.a.g(obj);
        ir.q1 q1Var = ((p1.m) this.$interactionSource).f26311a;
        final ho.l lVar = this.$onPauseScrolling;
        ir.j jVar = new ir.j() { // from class: io.elevenlabs.ui.components.AutoScrollingChipRowKt$PromptChip$1$1.1
            public final Object emit(p1.j jVar2, wn.c<? super sn.z> cVar) {
                if (jVar2 instanceof p1.o) {
                    ho.l.this.invoke(Boolean.TRUE);
                } else if (jVar2 instanceof p1.p) {
                    ho.l.this.invoke(Boolean.FALSE);
                } else if (jVar2 instanceof p1.n) {
                    ho.l.this.invoke(Boolean.FALSE);
                }
                return sn.z.f31622a;
            }

            @Override // ir.j
            public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                return emit((p1.j) obj2, (wn.c<? super sn.z>) cVar);
            }
        };
        this.label = 1;
        q1Var.collect(jVar, this);
        return xn.a.f37986a;
    }
}
