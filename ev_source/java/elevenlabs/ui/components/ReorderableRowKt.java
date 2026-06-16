package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.d5;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000v\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a¿\u0001\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aE\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000e2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b \u0010!\u001aG\u0010&\u001a\u00020\u0006*\u00020\u00102\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010)\"\u0015\u0010,\u001a\u00020\u0005*\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00062²\u0006\u0010\u0010.\u001a\u0004\u0018\u00010-8\n@\nX\u008a\u008e\u0002²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002010\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", TokenNames.T, "", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function2;", "", "Lsn/z;", "onSwap", "Li3/t;", "modifier", "", "itemModifier", "Lkotlin/Function1;", "onDragStarted", "Lt1/z;", "listState", "Lt1/b;", "itemContent", "Lr1/g;", "horizontalArrangement", "Lr1/z1;", "contentPadding", "Li3/f;", "verticalAlignment", "ReorderableRow", "(Ljava/util/List;Lho/p;Li3/t;Lho/r;Lho/l;Lt1/z;Lho/r;Lr1/g;Lr1/z1;Li3/f;Lu2/m;II)V", "lazyListState", "Lio/elevenlabs/ui/components/DragDropState;", "rememberDragDropState", "(Lt1/z;Lho/p;Lho/l;Lu2/m;I)Lio/elevenlabs/ui/components/DragDropState;", "absoluteIndex", "Lt1/j;", "getVisibleItemInfoFor", "(Lt1/z;I)Lt1/j;", "dragDropState", FirebaseAnalytics.Param.INDEX, "Lr1/y;", FirebaseAnalytics.Param.CONTENT, "DraggableItem", "(Lt1/b;Lio/elevenlabs/ui/components/DragDropState;ILi3/t;Lho/r;Lu2/m;II)V", "Preview_ReorderableRow", "(Lu2/m;I)V", "getOffsetEnd", "(Lt1/j;)I", "offsetEnd", "Lfr/k1;", "overscrollJob", "Lh5/f;", "elevation", "", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReorderableRowKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DraggableItem(t1.b bVar, DragDropState dragDropState, int i10, i3.t tVar, ho.r rVar, u2.m mVar, int i11, int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        boolean z6;
        u2.r1 r10;
        boolean z10;
        i3.t a10;
        int i15;
        int i16;
        int i17;
        int i18;
        bVar.getClass();
        dragDropState.getClass();
        rVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1498797612);
        if ((i11 & 6) == 0) {
            if (qVar.f(bVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i13 = i18 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.h(dragDropState)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i13 |= i17;
        }
        if ((i11 & 384) == 0) {
            if (qVar.d(i10)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        int i19 = i12 & 4;
        if (i19 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            if ((i11 & 24576) == 0) {
                if (qVar.h(rVar)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i13 |= i15;
            }
            if ((i13 & 9363) == 9362) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i13 & 1, z6)) {
                i3.t tVar3 = i3.q.f13017a;
                if (i19 != 0) {
                    tVar2 = tVar3;
                }
                Integer currentIndexOfDraggedItem = dragDropState.getCurrentIndexOfDraggedItem();
                if (currentIndexOfDraggedItem != null && i10 == currentIndexOfDraggedItem.intValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u2.e eVar = u2.l.f33918a;
                if (z10) {
                    qVar.X(199950547);
                    i3.t d10 = i3.a.d(tVar3, 1.0f);
                    boolean h10 = qVar.h(dragDropState);
                    Object L = qVar.L();
                    if (h10 || L == eVar) {
                        L = new a2(dragDropState, 1);
                        qVar.h0(L);
                    }
                    a10 = p3.h0.r(d10, (ho.l) L);
                    qVar.p(false);
                } else {
                    qVar.X(1530484153);
                    Integer previousIndexOfDraggedItem$ui_release = dragDropState.getPreviousIndexOfDraggedItem$ui_release();
                    if (previousIndexOfDraggedItem$ui_release != null && i10 == previousIndexOfDraggedItem$ui_release.intValue()) {
                        qVar.X(200172941);
                        i3.t d11 = i3.a.d(tVar3, 1.0f);
                        boolean h11 = qVar.h(dragDropState);
                        Object L2 = qVar.L();
                        if (h11 || L2 == eVar) {
                            L2 = new a2(dragDropState, 2);
                            qVar.h0(L2);
                        }
                        tVar3 = p3.h0.r(d11, (ho.l) L2);
                        qVar.p(false);
                    } else {
                        qVar.X(200342046);
                        qVar.p(false);
                    }
                    a10 = t1.b.a(bVar, tVar3, j1.e.s(100, 0, j1.y.f18447d, 2), 6);
                    qVar.p(false);
                }
                i3.t then = a10.then(tVar2);
                r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(then, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, a11, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c5, qVar);
                rVar.invoke(r1.z.f29398a, Boolean.valueOf(z10), qVar, Integer.valueOf(((i13 >> 6) & 896) | 6));
                qVar.p(true);
            } else {
                qVar.R();
            }
            i3.t tVar4 = tVar2;
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new t1(bVar, dragDropState, i10, tVar4, rVar, i11, i12);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i11 & 24576) == 0) {
        }
        if ((i13 & 9363) == 9362) {
        }
        if (!qVar.O(i13 & 1, z6)) {
        }
        i3.t tVar42 = tVar2;
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z DraggableItem$lambda$0$0(DragDropState dragDropState, p3.i0 i0Var) {
        i0Var.getClass();
        ((p3.y0) i0Var).A(dragDropState.getDraggingItemOffset$ui_release() * 0.67f);
        return sn.z.f31622a;
    }

    public static final sn.z DraggableItem$lambda$1$0(DragDropState dragDropState, p3.i0 i0Var) {
        i0Var.getClass();
        ((p3.y0) i0Var).A(((Number) dragDropState.getPreviousItemOffset().d()).floatValue() * 0.67f);
        return sn.z.f31622a;
    }

    public static final sn.z DraggableItem$lambda$3(t1.b bVar, DragDropState dragDropState, int i10, i3.t tVar, ho.r rVar, int i11, int i12, u2.m mVar, int i13) {
        DraggableItem(bVar, dragDropState, i10, tVar, rVar, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final void Preview_ReorderableRow(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-536727456);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = u2.r.A(ig.f.I("a", "b", "c", "d"));
                qVar.h0(L);
            }
            u2.z0 z0Var = (u2.z0) L;
            i3.t e10 = r1.p2.e(i3.q.f13017a, 1.0f);
            List<String> Preview_ReorderableRow$lambda$1 = Preview_ReorderableRow$lambda$1(z0Var);
            r1.u0 u0Var = r1.j.f29228a;
            r1.h h10 = r1.j.h(2, i3.d.C0);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new n1(z0Var, 1);
                qVar.h0(L2);
            }
            ReorderableRow(Preview_ReorderableRow$lambda$1, (ho.p) L2, e10, null, null, null, ComposableSingletons$ReorderableRowKt.INSTANCE.getLambda$821822278$ui_release(), h10, null, null, qVar, 14156208, 824);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 3);
        }
    }

    private static final List<String> Preview_ReorderableRow$lambda$1(u2.z0 z0Var) {
        return (List) z0Var.getValue();
    }

    public static final sn.z Preview_ReorderableRow$lambda$3$0(u2.z0 z0Var, int i10, int i11) {
        ArrayList i12 = tn.o.i1(Preview_ReorderableRow$lambda$1(z0Var));
        i12.add(i11, i12.remove(i10));
        z0Var.setValue(i12);
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ReorderableRow$lambda$4(int i10, u2.m mVar, int i11) {
        Preview_ReorderableRow(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void ReorderableRow(final List<? extends T> list, ho.p pVar, i3.t tVar, ho.r rVar, ho.l lVar, t1.z zVar, final ho.r rVar2, r1.g gVar, r1.z1 z1Var, i3.f fVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        ho.l lVar2;
        int i15;
        t1.z zVar2;
        int i16;
        r1.g gVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z6;
        u2.q qVar;
        i3.t tVar2;
        ho.r rVar3;
        r1.z1 z1Var2;
        ho.l lVar3;
        t1.z zVar3;
        r1.g gVar3;
        i3.f fVar2;
        u2.r1 r10;
        i3.t tVar3;
        i3.t tVar4;
        final ho.r rVar4;
        ho.l lVar4;
        int i25;
        t1.z zVar4;
        r1.g gVar4;
        r1.z1 z1Var3;
        int i26;
        r1.g gVar5;
        r1.z1 z1Var4;
        i3.f fVar3;
        t1.z zVar5;
        boolean z10;
        boolean z11;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        list.getClass();
        pVar.getClass();
        rVar2.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(205305329);
        if ((i10 & 6) == 0) {
            if (qVar2.h(list)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i12 = i31 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(pVar)) {
                i30 = 32;
            } else {
                i30 = 16;
            }
            i12 |= i30;
        }
        int i32 = i11 & 4;
        if (i32 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (qVar2.f(tVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0 && qVar2.h(rVar)) {
                    i29 = 2048;
                    i12 |= i29;
                }
                i29 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                i12 |= i29;
            }
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                lVar2 = lVar;
                if (qVar2.h(lVar2)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        zVar2 = zVar;
                        if (qVar2.f(zVar2)) {
                            i28 = 131072;
                            i12 |= i28;
                        }
                    } else {
                        zVar2 = zVar;
                    }
                    i28 = 65536;
                    i12 |= i28;
                } else {
                    zVar2 = zVar;
                }
                if ((1572864 & i10) == 0) {
                    if (qVar2.h(rVar2)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i12 |= i27;
                }
                i16 = i11 & 128;
                if (i16 != 0) {
                    i12 |= 12582912;
                    gVar2 = gVar;
                } else {
                    gVar2 = gVar;
                    if ((i10 & 12582912) == 0) {
                        if (qVar2.f(gVar2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                }
                i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i18 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    int i33 = i12;
                    if (qVar2.f(z1Var)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i20 = i33 | i19;
                    i21 = i11 & 512;
                    if (i21 == 0) {
                        i20 |= 805306368;
                        i22 = i21;
                    } else if ((i10 & 805306368) == 0) {
                        i22 = i21;
                        if (qVar2.f(fVar)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i20 |= i23;
                    } else {
                        i22 = i21;
                    }
                    i24 = i20;
                    if ((i24 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i24 & 1, z6)) {
                        qVar2.T();
                        int i34 = i10 & 1;
                        Object obj = u2.l.f33918a;
                        if (i34 != 0 && !qVar2.y()) {
                            qVar2.R();
                            if ((i11 & 8) != 0) {
                                i24 &= -7169;
                            }
                            if ((i11 & 32) != 0) {
                                i24 &= -458753;
                            }
                            rVar4 = rVar;
                            i26 = i24;
                            lVar4 = lVar2;
                            zVar5 = zVar2;
                            gVar5 = gVar2;
                            tVar2 = tVar;
                            z1Var4 = z1Var;
                            fVar3 = fVar;
                        } else {
                            if (i32 != 0) {
                                tVar3 = i3.q.f13017a;
                            } else {
                                tVar3 = tVar;
                            }
                            if ((i11 & 8) != 0) {
                                tVar4 = tVar3;
                                rVar4 = new i0(2);
                                i24 &= -7169;
                            } else {
                                tVar4 = tVar3;
                                rVar4 = rVar;
                            }
                            if (i14 != 0) {
                                Object L = qVar2.L();
                                if (L == obj) {
                                    L = new v0(7);
                                    qVar2.h0(L);
                                }
                                lVar4 = (ho.l) L;
                            } else {
                                lVar4 = lVar2;
                            }
                            if ((i11 & 32) != 0) {
                                i25 = 0;
                                zVar4 = t1.b0.a(0, qVar2, 3);
                                i24 &= -458753;
                            } else {
                                i25 = 0;
                                zVar4 = zVar2;
                            }
                            if (i16 != 0) {
                                gVar4 = r1.j.f29228a;
                            } else {
                                gVar4 = gVar2;
                            }
                            if (i18 != 0) {
                                float f10 = i25;
                                z1Var3 = new r1.d2(f10, f10, f10, f10);
                            } else {
                                z1Var3 = z1Var;
                            }
                            if (i22 != 0) {
                                gVar5 = gVar4;
                                z1Var4 = z1Var3;
                                fVar3 = i3.d.f13004y0;
                                zVar5 = zVar4;
                                i26 = i24;
                                tVar2 = tVar4;
                            } else {
                                i26 = i24;
                                gVar5 = gVar4;
                                z1Var4 = z1Var3;
                                tVar2 = tVar4;
                                fVar3 = fVar;
                                zVar5 = zVar4;
                            }
                        }
                        qVar2.q();
                        Object L2 = qVar2.L();
                        if (L2 == obj) {
                            L2 = u2.r.A(null);
                            qVar2.h0(L2);
                        }
                        u2.z0 z0Var = (u2.z0) L2;
                        Object L3 = qVar2.L();
                        if (L3 == obj) {
                            L3 = u2.r.q(qVar2);
                            qVar2.h0(L3);
                        }
                        fr.d0 d0Var = (fr.d0) L3;
                        final DragDropState rememberDragDropState = rememberDragDropState(zVar5, pVar, lVar4, qVar2, ((i26 >> 15) & 14) | (i26 & 112) | ((i26 >> 6) & 896));
                        boolean h10 = qVar2.h(rememberDragDropState) | qVar2.h(d0Var);
                        Object L4 = qVar2.L();
                        if (h10 || L4 == obj) {
                            L4 = new ReorderableRowKt$ReorderableRow$3$1(rememberDragDropState, z0Var, d0Var);
                            qVar2.h0(L4);
                        }
                        i3.t b10 = c4.l0.b(tVar2, rememberDragDropState, (PointerInputEventHandler) L4);
                        boolean h11 = qVar2.h(list) | qVar2.h(rememberDragDropState);
                        if ((((i26 & 7168) ^ 3072) > 2048 && qVar2.f(rVar4)) || (i26 & 3072) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z12 = z10 | h11;
                        if ((3670016 & i26) == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z13 = z12 | z11;
                        Object L5 = qVar2.L();
                        if (z13 || L5 == obj) {
                            L5 = new ho.l() { // from class: io.elevenlabs.ui.components.z1
                                @Override // ho.l
                                public final Object invoke(Object obj2) {
                                    sn.z ReorderableRow$lambda$6$0;
                                    ReorderableRow$lambda$6$0 = ReorderableRowKt.ReorderableRow$lambda$6$0(list, rememberDragDropState, rVar4, rVar2, (t1.t) obj2);
                                    return ReorderableRow$lambda$6$0;
                                }
                            };
                            qVar2.h0(L5);
                        }
                        int i35 = i26 >> 12;
                        qVar = qVar2;
                        rd.c1.d(b10, zVar5, z1Var4, gVar5, fVar3, null, false, null, (ho.l) L5, qVar, (i35 & 112) | ((i26 >> 18) & 896) | ((i26 >> 9) & 57344) | (i35 & 458752), 456);
                        lVar3 = lVar4;
                        rVar3 = rVar4;
                        zVar3 = zVar5;
                        z1Var2 = z1Var4;
                        gVar3 = gVar5;
                        fVar2 = fVar3;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        tVar2 = tVar;
                        rVar3 = rVar;
                        z1Var2 = z1Var;
                        lVar3 = lVar2;
                        zVar3 = zVar2;
                        gVar3 = gVar2;
                        fVar2 = fVar;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.f(list, pVar, tVar2, rVar3, lVar3, zVar3, rVar2, gVar3, z1Var2, fVar2, i10, i11);
                        return;
                    }
                    return;
                }
                i20 = i12;
                i21 = i11 & 512;
                if (i21 == 0) {
                }
                i24 = i20;
                if ((i24 & 306783379) == 306783378) {
                }
                if (!qVar2.O(i24 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar2 = lVar;
            if ((196608 & i10) == 0) {
            }
            if ((1572864 & i10) == 0) {
            }
            i16 = i11 & 128;
            if (i16 != 0) {
            }
            i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i18 != 0) {
            }
            i20 = i12;
            i21 = i11 & 512;
            if (i21 == 0) {
            }
            i24 = i20;
            if ((i24 & 306783379) == 306783378) {
            }
            if (!qVar2.O(i24 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        if ((i10 & 3072) == 0) {
        }
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        lVar2 = lVar;
        if ((196608 & i10) == 0) {
        }
        if ((1572864 & i10) == 0) {
        }
        i16 = i11 & 128;
        if (i16 != 0) {
        }
        i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i18 != 0) {
        }
        i20 = i12;
        i21 = i11 & 512;
        if (i21 == 0) {
        }
        i24 = i20;
        if ((i24 & 306783379) == 306783378) {
        }
        if (!qVar2.O(i24 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final i3.t ReorderableRow$lambda$0(Object obj, boolean z6, u2.m mVar, int i10) {
        obj.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.X(-1104964782);
        qVar.p(false);
        return i3.q.f13017a;
    }

    public static final sn.z ReorderableRow$lambda$1$0(int i10) {
        return sn.z.f31622a;
    }

    public static final fr.k1 ReorderableRow$lambda$3(u2.z0 z0Var) {
        return (fr.k1) z0Var.getValue();
    }

    public static final sn.z ReorderableRow$lambda$6$0(final List list, final DragDropState dragDropState, final ho.r rVar, final ho.r rVar2, t1.t tVar) {
        tVar.getClass();
        final n0 n0Var = new n0(23);
        ((t1.i) tVar).u(list.size(), new ho.l() { // from class: io.elevenlabs.ui.components.ReorderableRowKt$ReorderableRow$lambda$6$0$$inlined$itemsIndexed$default$1
            public final Object invoke(int i10) {
                return ho.p.this.invoke(Integer.valueOf(i10), list.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.ui.components.ReorderableRowKt$ReorderableRow$lambda$6$0$$inlined$itemsIndexed$default$2
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                list.get(i10);
                return null;
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.ui.components.ReorderableRowKt$ReorderableRow$lambda$6$0$$inlined$itemsIndexed$default$3
            public final void invoke(final t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
                boolean z10;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((u2.q) mVar).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar = (u2.q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    final Object obj = list.get(i10);
                    int i15 = i12 & 126;
                    qVar.X(-1995400656);
                    int i16 = i12;
                    DragDropState dragDropState2 = dragDropState;
                    ho.r rVar3 = rVar;
                    Integer currentIndexOfDraggedItem = dragDropState2.getCurrentIndexOfDraggedItem();
                    if (currentIndexOfDraggedItem != null && i10 == currentIndexOfDraggedItem.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i3.t tVar2 = (i3.t) rVar3.invoke(obj, Boolean.valueOf(z10), qVar, 0);
                    final ho.r rVar4 = rVar2;
                    ReorderableRowKt.DraggableItem(bVar, dragDropState2, i10, tVar2, c3.k.d(-1027801024, true, new ho.r() { // from class: io.elevenlabs.ui.components.ReorderableRowKt$ReorderableRow$4$1$2$1
                        private static final float invoke$lambda$0(u2.s2 s2Var) {
                            return ((h5.f) s2Var.getValue()).f12083a;
                        }

                        public final void invoke(r1.y yVar, boolean z11, u2.m mVar2, int i17) {
                            int i18;
                            boolean z12;
                            float f10;
                            int i19;
                            yVar.getClass();
                            if ((i17 & 48) == 0) {
                                if (((u2.q) mVar2).g(z11)) {
                                    i19 = 32;
                                } else {
                                    i19 = 16;
                                }
                                i18 = i17 | i19;
                            } else {
                                i18 = i17;
                            }
                            if ((i18 & 145) != 144) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            u2.q qVar2 = (u2.q) mVar2;
                            if (qVar2.O(i18 & 1, z12)) {
                                if (z11) {
                                    f10 = 4;
                                } else {
                                    f10 = 0;
                                }
                                float invoke$lambda$0 = invoke$lambda$0(j1.f.a(f10, null, "elevation", qVar2, 384, 10));
                                if ((62 & 1) != 0) {
                                    invoke$lambda$0 = t2.o.f32177b;
                                }
                                q2.e0 e0Var = new q2.e0(invoke$lambda$0, t2.o.f32185j, t2.o.f32183h, t2.o.f32184i, t2.o.f32182g, t2.o.f32180e);
                                final ho.r rVar5 = ho.r.this;
                                final t1.b bVar2 = bVar;
                                final T t10 = obj;
                                d5.c(null, null, null, e0Var, c3.k.d(1784542478, true, new ho.q() { // from class: io.elevenlabs.ui.components.ReorderableRowKt$ReorderableRow$4$1$2$1.1
                                    public final void invoke(r1.y yVar2, u2.m mVar3, int i20) {
                                        boolean z13;
                                        yVar2.getClass();
                                        if ((i20 & 17) != 16) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        u2.q qVar3 = (u2.q) mVar3;
                                        if (qVar3.O(i20 & 1, z13)) {
                                            ho.r.this.invoke(bVar2, t10, qVar3, 0);
                                        } else {
                                            qVar3.R();
                                        }
                                    }

                                    @Override // ho.q
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                        invoke((r1.y) obj2, (u2.m) obj3, ((Number) obj4).intValue());
                                        return sn.z.f31622a;
                                    }
                                }, qVar2), qVar2, 196608);
                                return;
                            }
                            qVar2.R();
                        }

                        @Override // ho.r
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            invoke((r1.y) obj2, ((Boolean) obj3).booleanValue(), (u2.m) obj4, ((Number) obj5).intValue());
                            return sn.z.f31622a;
                        }
                    }, qVar), qVar, ((i15 << 3) & 896) | (i16 & 14) | 24576, 0);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return sn.z.f31622a;
            }
        }, true, 2039820996));
        return sn.z.f31622a;
    }

    public static final Object ReorderableRow$lambda$6$0$0(int i10, Object obj) {
        obj.getClass();
        return obj;
    }

    public static final sn.z ReorderableRow$lambda$7(List list, ho.p pVar, i3.t tVar, ho.r rVar, ho.l lVar, t1.z zVar, ho.r rVar2, r1.g gVar, r1.z1 z1Var, i3.f fVar, int i10, int i11, u2.m mVar, int i12) {
        ReorderableRow(list, pVar, tVar, rVar, lVar, zVar, rVar2, gVar, z1Var, fVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final int getOffsetEnd(t1.j jVar) {
        jVar.getClass();
        t1.r rVar = (t1.r) jVar;
        return rVar.f31842p + rVar.q;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    public static final t1.j getVisibleItemInfoFor(t1.z zVar, int i10) {
        zVar.getClass();
        return (t1.j) tn.o.z0(i10 - ((t1.r) ((t1.j) tn.o.w0(((t1.q) zVar.h()).f31820k))).f31827a, ((t1.q) zVar.h()).f31820k);
    }

    public static final DragDropState rememberDragDropState(t1.z zVar, ho.p pVar, ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        zVar.getClass();
        pVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (L == eVar) {
            L = u2.r.q(qVar);
            qVar.h0(L);
        }
        fr.d0 d0Var = (fr.d0) L;
        if ((((i10 & 14) ^ 6) > 4 && qVar.f(zVar)) || (i10 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        Object L2 = qVar.L();
        if (z6 || L2 == eVar) {
            L2 = new DragDropState(zVar, d0Var, pVar, lVar);
            qVar.h0(L2);
        }
        return (DragDropState) L2;
    }
}
