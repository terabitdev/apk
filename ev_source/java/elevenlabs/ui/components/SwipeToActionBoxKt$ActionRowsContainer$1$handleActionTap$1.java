package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import kotlin.Metadata;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.ui.components.SwipeToActionBoxKt$ActionRowsContainer$1$handleActionTap$1", f = "SwipeToActionBox.kt", l = {294, 300, 302, 308, 310}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class SwipeToActionBoxKt$ActionRowsContainer$1$handleActionTap$1 extends yn.i implements ho.p {
    final /* synthetic */ ActionConfig $action;
    final /* synthetic */ ActionSpec $actionSpec;
    final /* synthetic */ n1.p $state;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToActionBoxKt$ActionRowsContainer$1$handleActionTap$1(ActionConfig actionConfig, ActionSpec actionSpec, n1.p pVar, wn.c<? super SwipeToActionBoxKt$ActionRowsContainer$1$handleActionTap$1> cVar) {
        super(2, cVar);
        this.$action = actionConfig;
        this.$actionSpec = actionSpec;
        this.$state = pVar;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new SwipeToActionBoxKt$ActionRowsContainer$1$handleActionTap$1(this.$action, this.$actionSpec, this.$state, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((SwipeToActionBoxKt$ActionRowsContainer$1$handleActionTap$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        if (r10.invoke(r0, r9) == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (n1.g.j(r0, r1, r9) == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r10 == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (n1.g.j(r10, r0, r9) == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        if (fr.g0.m(200, r9) == r6) goto L33;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            sn.a.g(obj);
                            ho.p onAction = this.$actionSpec.getOnAction();
                            ActionConfig actionConfig = this.$action;
                            this.label = 5;
                        }
                    }
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                sn.a.g(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    n1.p pVar = this.$state;
                    SwipeAnchor swipeAnchor = SwipeAnchor.SettledAtCenter;
                    this.Z$0 = booleanValue;
                    this.label = 3;
                }
                return sn.z.f31622a;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            this.label = 1;
        }
        if (this.$action.isDestructive()) {
            ho.p onAction2 = this.$actionSpec.getOnAction();
            ActionConfig actionConfig2 = this.$action;
            this.label = 2;
            obj = onAction2.invoke(actionConfig2, this);
        } else {
            n1.p pVar2 = this.$state;
            SwipeAnchor swipeAnchor2 = SwipeAnchor.SettledAtCenter;
            this.label = 4;
        }
        return aVar;
    }
}
