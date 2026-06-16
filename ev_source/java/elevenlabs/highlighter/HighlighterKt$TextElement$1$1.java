package io.elevenlabs.highlighter;

import com.google.protobuf.c6;
import fr.d0;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.highlighter.HighlighterKt$TextElement$1$1", f = "Highlighter.kt", l = {989}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class HighlighterKt$TextElement$1$1 extends yn.i implements ho.p {
    final /* synthetic */ Integer $currentItemIndex;
    final /* synthetic */ TextBoundsDrawerState $drawerState;
    final /* synthetic */ t1.z $lazyListState;
    final /* synthetic */ ho.l $onScrollJumped;
    final /* synthetic */ boolean $scrollJustJumped;
    final /* synthetic */ boolean $shouldScrollToItem;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlighterKt$TextElement$1$1(TextBoundsDrawerState textBoundsDrawerState, Integer num, boolean z6, t1.z zVar, boolean z10, ho.l lVar, wn.c<? super HighlighterKt$TextElement$1$1> cVar) {
        super(2, cVar);
        this.$drawerState = textBoundsDrawerState;
        this.$currentItemIndex = num;
        this.$shouldScrollToItem = z6;
        this.$lazyListState = zVar;
        this.$scrollJustJumped = z10;
        this.$onScrollJumped = lVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new HighlighterKt$TextElement$1$1(this.$drawerState, this.$currentItemIndex, this.$shouldScrollToItem, this.$lazyListState, this.$scrollJustJumped, this.$onScrollJumped, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((HighlighterKt$TextElement$1$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        Object scrollAndGetIfAnimated;
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
            int selectedPositionTop = this.$drawerState.getSelectedPositionTop();
            Integer num = this.$currentItemIndex;
            if (num != null && this.$shouldScrollToItem && selectedPositionTop >= 0) {
                t1.z zVar = this.$lazyListState;
                boolean z6 = !this.$scrollJustJumped;
                int intValue = num.intValue();
                this.I$0 = selectedPositionTop;
                this.label = 1;
                scrollAndGetIfAnimated = HighlighterKt.scrollAndGetIfAnimated(zVar, z6, intValue, selectedPositionTop, this);
                xn.a aVar = xn.a.f37986a;
                if (scrollAndGetIfAnimated == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
        this.$onScrollJumped.invoke(Boolean.FALSE);
        return sn.z.f31622a;
    }
}
