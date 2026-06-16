package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1", f = "AutoScrollingChipRow.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1 extends yn.i implements ho.p {
    final /* synthetic */ fr.d0 $coroutineScope;
    final /* synthetic */ u2.z0 $currentItems$delegate;
    final /* synthetic */ t1.z $lazyListState;
    final /* synthetic */ float $scrollDx;
    int label;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1$1", f = "AutoScrollingChipRow.kt", l = {119}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        final /* synthetic */ t1.z $lazyListState;
        final /* synthetic */ float $scrollDx;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(t1.z zVar, float f10, wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$lazyListState = zVar;
            this.$scrollDx = f10;
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(this.$lazyListState, this.$scrollDx, cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
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
                t1.z zVar = this.$lazyListState;
                int max = Math.max(0, zVar.f31876e.f31853c.h() - ((int) this.$scrollDx));
                this.label = 1;
                Object j4 = zVar.j(0, max, this);
                xn.a aVar = xn.a.f37986a;
                if (j4 == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1(t1.z zVar, fr.d0 d0Var, u2.z0 z0Var, float f10, wn.c<? super AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1> cVar) {
        super(2, cVar);
        this.$lazyListState = zVar;
        this.$coroutineScope = d0Var;
        this.$currentItems$delegate = z0Var;
        this.$scrollDx = f10;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1(this.$lazyListState, this.$coroutineScope, this.$currentItems$delegate, this.$scrollDx, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        List AutoScrollingChipRow_6PoWaU8$lambda$8;
        if (this.label == 0) {
            sn.a.g(obj);
            AutoScrollingChipRow_6PoWaU8$lambda$8 = AutoScrollingChipRowKt.AutoScrollingChipRow_6PoWaU8$lambda$8(this.$currentItems$delegate);
            int h10 = this.$lazyListState.f31876e.f31852b.h();
            List subList = AutoScrollingChipRow_6PoWaU8$lambda$8.subList(0, h10);
            List subList2 = AutoScrollingChipRow_6PoWaU8$lambda$8.subList(h10, AutoScrollingChipRow_6PoWaU8$lambda$8.size());
            fr.g0.D(this.$coroutineScope, null, null, new AnonymousClass1(this.$lazyListState, this.$scrollDx, null), 3);
            this.$currentItems$delegate.setValue(tn.o.O0(subList, subList2));
            return sn.z.f31622a;
        }
        c6.x("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
