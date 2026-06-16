package io.elevenlabs.ui.components;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0011J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR+\u0010&\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010%R+\u0010-\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R/\u00104\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00078@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R<\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000206052\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u000206058\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R/\u0010B\u001a\u0004\u0018\u00010<2\b\u0010 \u001a\u0004\u0018\u00010<8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010/\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR/\u0010F\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010/\u001a\u0004\bD\u00101\"\u0004\bE\u00103R\u0016\u0010H\u001a\u0004\u0018\u00010<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010?R\"\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010N\u001a\u0004\u0018\u00010<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010?R\u0014\u0010P\u001a\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0019¨\u0006Q"}, d2 = {"Lio/elevenlabs/ui/components/DragDropState;", "", "Lt1/z;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lfr/d0;", "scope", "Lkotlin/Function2;", "", "Lsn/z;", "onSwap", "Lkotlin/Function1;", "onDragStarted", "<init>", "(Lt1/z;Lfr/d0;Lho/p;Lho/l;)V", "Lo3/b;", "offset", "onDragStart-k-4lQ0M", "(J)V", "onDragStart", "onDragInterrupted", "()V", "onDrag-k-4lQ0M", "onDrag", "", "checkForOverScroll", "()F", "Lt1/z;", "getState", "()Lt1/z;", "Lfr/d0;", "Lho/p;", "Lho/l;", "<set-?>", "draggedDistance$delegate", "Lu2/w0;", "getDraggedDistance", "setDraggedDistance", "(F)V", "draggedDistance", "draggingItemInitialOffset$delegate", "Lu2/x0;", "getDraggingItemInitialOffset", "()I", "setDraggingItemInitialOffset", "(I)V", "draggingItemInitialOffset", "previousIndexOfDraggedItem$delegate", "Lu2/z0;", "getPreviousIndexOfDraggedItem$ui_release", "()Ljava/lang/Integer;", "setPreviousIndexOfDraggedItem", "(Ljava/lang/Integer;)V", "previousIndexOfDraggedItem", "Lj1/d;", "Lj1/m;", "value", "previousItemOffset", "Lj1/d;", "getPreviousItemOffset$ui_release", "()Lj1/d;", "Lt1/j;", "initiallyDraggedElement$delegate", "getInitiallyDraggedElement", "()Lt1/j;", "setInitiallyDraggedElement", "(Lt1/j;)V", "initiallyDraggedElement", "currentIndexOfDraggedItem$delegate", "getCurrentIndexOfDraggedItem", "setCurrentIndexOfDraggedItem", "currentIndexOfDraggedItem", "getDraggingItemLayoutInfo", "draggingItemLayoutInfo", "Lsn/k;", "getInitialOffsets", "()Lsn/k;", "initialOffsets", "getCurrentElement", "currentElement", "getDraggingItemOffset$ui_release", "draggingItemOffset", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DragDropState {
    public static final int $stable = 8;

    /* renamed from: currentIndexOfDraggedItem$delegate, reason: from kotlin metadata */
    private final u2.z0 currentIndexOfDraggedItem;

    /* renamed from: draggedDistance$delegate, reason: from kotlin metadata */
    private final u2.w0 draggedDistance;

    /* renamed from: draggingItemInitialOffset$delegate, reason: from kotlin metadata */
    private final u2.x0 draggingItemInitialOffset;

    /* renamed from: initiallyDraggedElement$delegate, reason: from kotlin metadata */
    private final u2.z0 initiallyDraggedElement;
    private final ho.l onDragStarted;
    private final ho.p onSwap;

    /* renamed from: previousIndexOfDraggedItem$delegate, reason: from kotlin metadata */
    private final u2.z0 previousIndexOfDraggedItem;
    private j1.d previousItemOffset;
    private final fr.d0 scope;
    private final t1.z state;

    public DragDropState(t1.z zVar, fr.d0 d0Var, ho.p pVar, ho.l lVar) {
        zVar.getClass();
        d0Var.getClass();
        pVar.getClass();
        lVar.getClass();
        this.state = zVar;
        this.scope = d0Var;
        this.onSwap = pVar;
        this.onDragStarted = lVar;
        this.draggedDistance = new u2.e1(t2.u.P);
        this.draggingItemInitialOffset = new u2.f1(0);
        this.previousIndexOfDraggedItem = u2.r.A(null);
        this.previousItemOffset = j1.e.a(t2.u.P);
        this.initiallyDraggedElement = u2.r.A(null);
        this.currentIndexOfDraggedItem = u2.r.A(null);
    }

    private final t1.j getCurrentElement() {
        Integer currentIndexOfDraggedItem = getCurrentIndexOfDraggedItem();
        if (currentIndexOfDraggedItem != null) {
            return ReorderableRowKt.getVisibleItemInfoFor(this.state, currentIndexOfDraggedItem.intValue());
        }
        return null;
    }

    private final float getDraggedDistance() {
        return ((u2.e1) this.draggedDistance).h();
    }

    private final int getDraggingItemInitialOffset() {
        return ((u2.f1) this.draggingItemInitialOffset).h();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Iterable] */
    private final t1.j getDraggingItemLayoutInfo() {
        Object obj;
        Iterator it = ((t1.q) this.state.h()).f31820k.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                int i10 = ((t1.r) ((t1.j) obj)).f31827a;
                Integer currentIndexOfDraggedItem = getCurrentIndexOfDraggedItem();
                if (currentIndexOfDraggedItem != null && i10 == currentIndexOfDraggedItem.intValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (t1.j) obj;
    }

    private final sn.k getInitialOffsets() {
        t1.j initiallyDraggedElement = getInitiallyDraggedElement();
        if (initiallyDraggedElement != null) {
            return new sn.k(Integer.valueOf(((t1.r) initiallyDraggedElement).f31842p), Integer.valueOf(ReorderableRowKt.getOffsetEnd(initiallyDraggedElement)));
        }
        return null;
    }

    private final t1.j getInitiallyDraggedElement() {
        return (t1.j) this.initiallyDraggedElement.getValue();
    }

    private final void setDraggedDistance(float f10) {
        ((u2.e1) this.draggedDistance).i(f10);
    }

    private final void setDraggingItemInitialOffset(int i10) {
        ((u2.f1) this.draggingItemInitialOffset).i(i10);
    }

    private final void setInitiallyDraggedElement(t1.j jVar) {
        this.initiallyDraggedElement.setValue(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPreviousIndexOfDraggedItem(Integer num) {
        this.previousIndexOfDraggedItem.setValue(num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        if (r0.floatValue() < t2.u.P) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (r0.floatValue() > t2.u.P) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        r5 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float checkForOverScroll() {
        Float valueOf;
        if (getInitiallyDraggedElement() != null) {
            float draggedDistance = ((t1.r) r0).f31842p + getDraggedDistance();
            float offsetEnd = ReorderableRowKt.getOffsetEnd(r0) + getDraggedDistance();
            Float f10 = null;
            if (getDraggedDistance() > t2.u.P) {
                valueOf = Float.valueOf((offsetEnd - ((t1.q) this.state.h()).f31822m) + 50.0f);
            } else {
                if (getDraggedDistance() < t2.u.P) {
                    valueOf = Float.valueOf((draggedDistance - ((t1.q) this.state.h()).f31821l) - 50.0f);
                }
                if (f10 != null) {
                    return f10.floatValue();
                }
            }
        }
        return t2.u.P;
    }

    public final Integer getCurrentIndexOfDraggedItem() {
        return (Integer) this.currentIndexOfDraggedItem.getValue();
    }

    public final float getDraggingItemOffset$ui_release() {
        if (getDraggingItemLayoutInfo() != null) {
            return (getDraggingItemInitialOffset() + getDraggedDistance()) - ((t1.r) r0).f31842p;
        }
        return t2.u.P;
    }

    public final Integer getPreviousIndexOfDraggedItem$ui_release() {
        return (Integer) this.previousIndexOfDraggedItem.getValue();
    }

    /* renamed from: getPreviousItemOffset$ui_release, reason: from getter */
    public final j1.d getPreviousItemOffset() {
        return this.previousItemOffset;
    }

    public final t1.z getState() {
        return this.state;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Iterable] */
    /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    public final void m1829onDragk4lQ0M(long offset) {
        Object obj;
        setDraggedDistance(Float.intBitsToFloat((int) (offset >> 32)) + getDraggedDistance());
        sn.k initialOffsets = getInitialOffsets();
        if (initialOffsets != null) {
            int intValue = ((Number) initialOffsets.f31600a).intValue();
            int intValue2 = ((Number) initialOffsets.f31601b).intValue();
            float draggedDistance = intValue + getDraggedDistance();
            float draggedDistance2 = intValue2 + getDraggedDistance();
            t1.j currentElement = getCurrentElement();
            if (currentElement != null) {
                ?? r12 = ((t1.q) this.state.h()).f31820k;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : r12) {
                    t1.j jVar = (t1.j) obj2;
                    if (ReorderableRowKt.getOffsetEnd(jVar) >= draggedDistance) {
                        t1.r rVar = (t1.r) jVar;
                        if (rVar.f31842p <= draggedDistance2 && ((t1.r) currentElement).f31827a != rVar.f31827a) {
                            arrayList.add(obj2);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        t1.j jVar2 = (t1.j) obj;
                        if (draggedDistance - ((t1.r) currentElement).f31842p > t2.u.P) {
                            if (draggedDistance2 > ReorderableRowKt.getOffsetEnd(jVar2)) {
                                break;
                            }
                        } else if (draggedDistance < ((t1.r) jVar2).f31842p) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                t1.j jVar3 = (t1.j) obj;
                if (jVar3 != null) {
                    Integer currentIndexOfDraggedItem = getCurrentIndexOfDraggedItem();
                    if (currentIndexOfDraggedItem != null) {
                        this.onSwap.invoke(Integer.valueOf(currentIndexOfDraggedItem.intValue()), Integer.valueOf(((t1.r) jVar3).f31827a));
                        fr.g0.D(this.scope, null, null, new DragDropState$onDrag$1$1$3$1$1(this, null), 3);
                    }
                    setCurrentIndexOfDraggedItem(Integer.valueOf(((t1.r) jVar3).f31827a));
                }
            }
        }
    }

    public final void onDragInterrupted() {
        if (getCurrentIndexOfDraggedItem() != null) {
            setPreviousIndexOfDraggedItem(getCurrentIndexOfDraggedItem());
            fr.g0.D(this.scope, null, null, new DragDropState$onDragInterrupted$1(this, getDraggingItemOffset$ui_release(), null), 3);
        }
        setDraggingItemInitialOffset(0);
        setDraggedDistance(t2.u.P);
        setCurrentIndexOfDraggedItem(null);
        setInitiallyDraggedElement(null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Iterable] */
    /* renamed from: onDragStart-k-4lQ0M, reason: not valid java name */
    public final void m1830onDragStartk4lQ0M(long offset) {
        Object obj;
        Iterator it = ((t1.q) this.state.h()).f31820k.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                t1.r rVar = (t1.r) ((t1.j) obj);
                int i10 = rVar.f31842p;
                int i11 = rVar.q + i10;
                int intBitsToFloat = (int) Float.intBitsToFloat((int) (offset >> 32));
                if (i10 <= intBitsToFloat && intBitsToFloat <= i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        t1.j jVar = (t1.j) obj;
        if (jVar != null) {
            t1.r rVar2 = (t1.r) jVar;
            int i12 = rVar2.f31827a;
            setCurrentIndexOfDraggedItem(Integer.valueOf(i12));
            setInitiallyDraggedElement(jVar);
            setDraggingItemInitialOffset(rVar2.f31842p);
            this.onDragStarted.invoke(Integer.valueOf(i12));
        }
    }

    public final void setCurrentIndexOfDraggedItem(Integer num) {
        this.currentIndexOfDraggedItem.setValue(num);
    }
}
