package io.elevenlabs.highlighter;

import com.google.protobuf.c6;
import fr.d0;
import ir.a1;
import kotlin.Metadata;
import t1.r;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.highlighter.HighlighterKt$Highlighter$8$1", f = "Highlighter.kt", l = {530}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class HighlighterKt$Highlighter$8$1 extends yn.i implements ho.p {
    final /* synthetic */ s2 $currentChapterCallback;
    final /* synthetic */ t1.z $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlighterKt$Highlighter$8$1(t1.z zVar, s2 s2Var, wn.c<? super HighlighterKt$Highlighter$8$1> cVar) {
        super(2, cVar);
        this.$listState = zVar;
        this.$currentChapterCallback = s2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    public static final Integer invokeSuspend$lambda$0(t1.z zVar) {
        Integer chapterIndexFromKey;
        t1.j jVar = (t1.j) tn.o.y0(((t1.q) zVar.h()).f31820k);
        if (jVar != null) {
            chapterIndexFromKey = HighlighterKt.chapterIndexFromKey(((r) jVar).f31838l);
            return chapterIndexFromKey;
        }
        return null;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new HighlighterKt$Highlighter$8$1(this.$listState, this.$currentChapterCallback, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((HighlighterKt$Highlighter$8$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
            final t1.z zVar = this.$listState;
            ir.i o6 = ir.r.o(new a1(u2.r.K(new ho.a() { // from class: io.elevenlabs.highlighter.w
                @Override // ho.a
                public final Object invoke() {
                    Integer invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = HighlighterKt$Highlighter$8$1.invokeSuspend$lambda$0(t1.z.this);
                    return invokeSuspend$lambda$0;
                }
            }), 0));
            final s2 s2Var = this.$currentChapterCallback;
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.highlighter.HighlighterKt$Highlighter$8$1.2
                public final Object emit(int i11, wn.c<? super sn.z> cVar) {
                    ((ho.l) s2.this.getValue()).invoke(new Integer(i11));
                    return sn.z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit(((Number) obj2).intValue(), (wn.c<? super sn.z>) cVar);
                }
            };
            this.label = 1;
            Object collect = o6.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return sn.z.f31622a;
    }
}
