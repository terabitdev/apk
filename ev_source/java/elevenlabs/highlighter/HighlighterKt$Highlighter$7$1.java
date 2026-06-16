package io.elevenlabs.highlighter;

import com.google.protobuf.c6;
import fr.d0;
import kotlin.Metadata;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.highlighter.HighlighterKt$Highlighter$7$1", f = "Highlighter.kt", l = {514}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class HighlighterKt$Highlighter$7$1 extends yn.i implements ho.p {
    final /* synthetic */ Integer $currentItemIndex;
    final /* synthetic */ t1.z $listState;
    final /* synthetic */ z0 $scrollJustJumped$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlighterKt$Highlighter$7$1(Integer num, t1.z zVar, z0 z0Var, wn.c<? super HighlighterKt$Highlighter$7$1> cVar) {
        super(2, cVar);
        this.$currentItemIndex = num;
        this.$listState = zVar;
        this.$scrollJustJumped$delegate = z0Var;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new HighlighterKt$Highlighter$7$1(this.$currentItemIndex, this.$listState, this.$scrollJustJumped$delegate, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((HighlighterKt$Highlighter$7$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        z0 z0Var;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                z0Var = (z0) this.L$0;
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            Integer num = this.$currentItemIndex;
            if (num != null) {
                z0Var = this.$scrollJustJumped$delegate;
                t1.z zVar = this.$listState;
                int intValue = num.intValue();
                this.L$0 = z0Var;
                this.label = 1;
                obj = HighlighterKt.scrollAndGetIfAnimated(zVar, true, intValue, 0, this);
                xn.a aVar = xn.a.f37986a;
                if (obj == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
        HighlighterKt.Highlighter$lambda$14(z0Var, !((Boolean) obj).booleanValue());
        return sn.z.f31622a;
    }
}
