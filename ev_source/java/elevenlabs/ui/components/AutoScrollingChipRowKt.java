package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import n1.s3;
import q2.e5;
import q2.j7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000L\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\r\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0018\u001a\u00020\u0004*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\"²\u0006\u000e\u0010\u001e\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00008\nX\u008a\u0084\u0002²\u0006\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "", FirebaseAnalytics.Param.ITEMS, "Lkotlin/Function1;", "Lsn/z;", "onChipClick", "Li3/t;", "modifier", "Lh5/f;", "velocity", "spacing", "AutoScrollingChipRow-6PoWaU8", "(Ljava/util/List;Lho/l;Li3/t;FFLu2/m;II)V", "AutoScrollingChipRow", ParameterNames.TEXT, "Lkotlin/Function0;", "onClick", "", "onPauseScrolling", "PromptChip", "(Ljava/lang/String;Lho/a;Lho/l;Li3/t;Lu2/m;II)V", "Ln1/d3;", "", "scrollDx", "autoScroll", "(Ln1/d3;FLwn/c;)Ljava/lang/Object;", "", "REQUIRED_ITEM_COUNT", TokenNames.I, "SCROLL_ANIMATION_DURATION_MS", "isPaused", "Lio/elevenlabs/ui/components/ChipItem;", "repeatedItems", "currentItems", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AutoScrollingChipRowKt {
    private static final int REQUIRED_ITEM_COUNT = 10;
    private static final int SCROLL_ANIMATION_DURATION_MS = 500;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: AutoScrollingChipRow-6PoWaU8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1776AutoScrollingChipRow6PoWaU8(List<String> list, final ho.l lVar, i3.t tVar, float f10, float f11, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        float f12;
        int i15;
        float f13;
        boolean z6;
        i3.t tVar3;
        float f14;
        float f15;
        u2.r1 r10;
        h hVar;
        i3.t tVar4;
        float x22;
        float f16;
        boolean z10;
        Object obj;
        final float f17;
        final t1.z zVar;
        u2.e eVar;
        int i16;
        int i17;
        int i18;
        list.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1793151877);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                f12 = f10;
                if (qVar.c(f12)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        f13 = f11;
                        if (qVar.c(f13)) {
                            i16 = 16384;
                            i12 |= i16;
                        }
                    } else {
                        f13 = f11;
                    }
                    i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    i12 |= i16;
                } else {
                    f13 = f11;
                }
                if ((i12 & 9363) != 9362) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar.O(i12 & 1, z6)) {
                    qVar.T();
                    if ((i10 & 1) != 0 && !qVar.y()) {
                        qVar.R();
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        tVar4 = tVar2;
                    } else {
                        if (i19 != 0) {
                            tVar4 = i3.q.f13017a;
                        } else {
                            tVar4 = tVar2;
                        }
                        if (i14 != 0) {
                            f12 = 20;
                        }
                        if ((i11 & 16) != 0) {
                            x22 = EchoTheme.INSTANCE.getSpacings(qVar, 6).getX2();
                            i12 &= -57345;
                            f16 = f12;
                            qVar.q();
                            if (!list.isEmpty()) {
                                r10 = qVar.r();
                                if (r10 != null) {
                                    hVar = new h(list, lVar, tVar4, f16, x22, i10, i11, 0);
                                    r10.f34012d = hVar;
                                    return;
                                }
                                return;
                            }
                            h5.c cVar = (h5.c) qVar.j(i4.j1.f13129h);
                            t1.z a10 = t1.b0.a(0, qVar, 3);
                            Object L = qVar.L();
                            u2.e eVar2 = u2.l.f33918a;
                            if (L == eVar2) {
                                L = u2.r.q(qVar);
                                qVar.h0(L);
                            }
                            final fr.d0 d0Var = (fr.d0) L;
                            Object L2 = qVar.L();
                            if (L2 == eVar2) {
                                L2 = u2.r.A(Boolean.FALSE);
                                qVar.h0(L2);
                            }
                            final u2.z0 z0Var = (u2.z0) L2;
                            float d02 = cVar.d0(f16) * 0.5f;
                            boolean f18 = qVar.f(list);
                            Object L3 = qVar.L();
                            if (f18 || L3 == eVar2) {
                                ArrayList arrayList = new ArrayList(10);
                                int i20 = 0;
                                for (int i21 = 10; i20 < i21; i21 = 10) {
                                    String str = list.get(i20 % list.size());
                                    String uuid = UUID.randomUUID().toString();
                                    uuid.getClass();
                                    arrayList.add(new ChipItem(str, uuid));
                                    i20++;
                                }
                                L3 = u2.r.A(arrayList);
                                qVar.h0(L3);
                            }
                            u2.z0 z0Var2 = (u2.z0) L3;
                            boolean f19 = qVar.f(AutoScrollingChipRow_6PoWaU8$lambda$6(z0Var2));
                            Object L4 = qVar.L();
                            if (f19 || L4 == eVar2) {
                                L4 = u2.r.A(AutoScrollingChipRow_6PoWaU8$lambda$6(z0Var2));
                                qVar.h0(L4);
                            }
                            final u2.z0 z0Var3 = (u2.z0) L4;
                            Object L5 = qVar.L();
                            if (L5 == eVar2) {
                                L5 = new PointerInputEventHandler() { // from class: io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow$2$1

                                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                                    @yn.e(c = "io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow$2$1$1", f = "AutoScrollingChipRow.kt", l = {90}, m = "invokeSuspend", v = 2)
                                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln1/i2;", "Lo3/b;", "it", "Lsn/z;", "<anonymous>", "(Ln1/i2;Lo3/b;)V"}, k = 3, mv = {2, 3, 0})
                                    /* renamed from: io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow$2$1$1, reason: invalid class name */
                                    /* loaded from: classes4.dex */
                                    public static final class AnonymousClass1 extends yn.i implements ho.q {
                                        final /* synthetic */ u2.z0 $isPaused$delegate;
                                        private /* synthetic */ Object L$0;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public AnonymousClass1(u2.z0 z0Var, wn.c<? super AnonymousClass1> cVar) {
                                            super(3, cVar);
                                            this.$isPaused$delegate = z0Var;
                                        }

                                        @Override // ho.q
                                        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            return m1777invoked4ec7I((n1.i2) obj, ((o3.b) obj2).f24764a, (wn.c) obj3);
                                        }

                                        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                                        public final Object m1777invoked4ec7I(n1.i2 i2Var, long j4, wn.c<? super sn.z> cVar) {
                                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isPaused$delegate, cVar);
                                            anonymousClass1.L$0 = i2Var;
                                            return anonymousClass1.invokeSuspend(sn.z.f31622a);
                                        }

                                        @Override // yn.a
                                        public final Object invokeSuspend(Object obj) {
                                            n1.i2 i2Var = (n1.i2) this.L$0;
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
                                                AutoScrollingChipRowKt.AutoScrollingChipRow_6PoWaU8$lambda$3(this.$isPaused$delegate, true);
                                                this.L$0 = null;
                                                this.label = 1;
                                                Object f10 = ((n1.l2) i2Var).f(this);
                                                xn.a aVar = xn.a.f37986a;
                                                if (f10 == aVar) {
                                                    return aVar;
                                                }
                                            }
                                            AutoScrollingChipRowKt.AutoScrollingChipRow_6PoWaU8$lambda$3(this.$isPaused$delegate, false);
                                            return sn.z.f31622a;
                                        }
                                    }

                                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                    public final Object invoke(c4.a0 a0Var, wn.c<? super sn.z> cVar2) {
                                        Object d10 = s3.d(a0Var, null, new AnonymousClass1(u2.z0.this, null), null, cVar2, 11);
                                        if (d10 == xn.a.f37986a) {
                                            return d10;
                                        }
                                        return sn.z.f31622a;
                                    }
                                };
                                qVar.h0(L5);
                            }
                            i3.t b10 = c4.l0.b(tVar4, sn.z.f31622a, (PointerInputEventHandler) L5);
                            r1.d2 d10 = r1.d.d(EchoTheme.INSTANCE.getSpacings(qVar, 6).getX6(), t2.u.P, 2);
                            r1.u0 u0Var = r1.j.f29228a;
                            r1.h h10 = r1.j.h(x22, i3.d.B0);
                            float f20 = f16;
                            i3.k kVar = i3.d.f13005z0;
                            boolean f21 = qVar.f(z0Var3);
                            if ((i12 & 112) == 32) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean f22 = f21 | z10 | qVar.f(a10) | qVar.h(d0Var) | qVar.c(d02);
                            Object L6 = qVar.L();
                            if (!f22 && L6 != eVar2) {
                                f17 = d02;
                                eVar = eVar2;
                                obj = L6;
                                zVar = a10;
                            } else {
                                f17 = d02;
                                zVar = a10;
                                eVar = eVar2;
                                obj = new ho.l() { // from class: io.elevenlabs.ui.components.i
                                    @Override // ho.l
                                    public final Object invoke(Object obj2) {
                                        sn.z AutoScrollingChipRow_6PoWaU8$lambda$11$0;
                                        AutoScrollingChipRow_6PoWaU8$lambda$11$0 = AutoScrollingChipRowKt.AutoScrollingChipRow_6PoWaU8$lambda$11$0(u2.z0.this, lVar, zVar, d0Var, f17, z0Var, (t1.t) obj2);
                                        return AutoScrollingChipRow_6PoWaU8$lambda$11$0;
                                    }
                                };
                                z0Var = z0Var;
                                qVar.h0(obj);
                            }
                            float f23 = x22;
                            i3.t tVar5 = tVar4;
                            t1.z zVar2 = zVar;
                            u2.e eVar3 = eVar;
                            rd.c1.d(b10, zVar2, d10, h10, kVar, null, false, null, (ho.l) obj, qVar, 12779520, 328);
                            Boolean valueOf = Boolean.valueOf(AutoScrollingChipRow_6PoWaU8$lambda$2(z0Var));
                            boolean f24 = qVar.f(zVar2) | qVar.c(f17);
                            Object L7 = qVar.L();
                            if (f24 || L7 == eVar3) {
                                L7 = new AutoScrollingChipRowKt$AutoScrollingChipRow$4$1(zVar2, f17, z0Var, null);
                                qVar.h0(L7);
                            }
                            u2.r.f((ho.p) L7, valueOf, qVar);
                            tVar3 = tVar5;
                            f15 = f23;
                            f14 = f20;
                        }
                    }
                    f16 = f12;
                    x22 = f13;
                    qVar.q();
                    if (!list.isEmpty()) {
                    }
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    f14 = f12;
                    f15 = f13;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    hVar = new h(list, lVar, tVar3, f14, f15, i10, i11, 1);
                    r10.f34012d = hVar;
                    return;
                }
                return;
            }
            f12 = f10;
            if ((i10 & 24576) == 0) {
            }
            if ((i12 & 9363) != 9362) {
            }
            if (qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        f12 = f10;
        if ((i10 & 24576) == 0) {
        }
        if ((i12 & 9363) != 9362) {
        }
        if (qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z AutoScrollingChipRow_6PoWaU8$lambda$0(List list, ho.l lVar, i3.t tVar, float f10, float f11, int i10, int i11, u2.m mVar, int i12) {
        m1776AutoScrollingChipRow6PoWaU8(list, lVar, tVar, f10, f11, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z AutoScrollingChipRow_6PoWaU8$lambda$11$0(final u2.z0 z0Var, final ho.l lVar, final t1.z zVar, final fr.d0 d0Var, final float f10, final u2.z0 z0Var2, t1.t tVar) {
        tVar.getClass();
        final List<ChipItem> AutoScrollingChipRow_6PoWaU8$lambda$8 = AutoScrollingChipRow_6PoWaU8$lambda$8(z0Var);
        final j jVar = new j(0);
        ((t1.i) tVar).u(AutoScrollingChipRow_6PoWaU8$lambda$8.size(), new ho.l() { // from class: io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow_6PoWaU8$lambda$11$0$$inlined$itemsIndexed$default$1
            public final Object invoke(int i10) {
                return ho.p.this.invoke(Integer.valueOf(i10), AutoScrollingChipRow_6PoWaU8$lambda$8.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow_6PoWaU8$lambda$11$0$$inlined$itemsIndexed$default$2
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                AutoScrollingChipRow_6PoWaU8$lambda$8.get(i10);
                return null;
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow_6PoWaU8$lambda$11$0$$inlined$itemsIndexed$default$3
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
                List AutoScrollingChipRow_6PoWaU8$lambda$82;
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
                    final ChipItem chipItem = (ChipItem) AutoScrollingChipRow_6PoWaU8$lambda$8.get(i10);
                    qVar.X(1022047142);
                    String text = chipItem.getText();
                    boolean f11 = qVar.f(lVar) | qVar.f(chipItem);
                    Object L = qVar.L();
                    Object obj = u2.l.f33918a;
                    if (f11 || L == obj) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1778invoke() {
                                ho.l.this.invoke(chipItem.getText());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1778invoke();
                                return sn.z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ho.a aVar = (ho.a) L;
                    Object L2 = qVar.L();
                    if (L2 == obj) {
                        final u2.z0 z0Var3 = z0Var2;
                        L2 = new ho.l() { // from class: io.elevenlabs.ui.components.AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$2$1
                            @Override // ho.l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke(((Boolean) obj2).booleanValue());
                                return sn.z.f31622a;
                            }

                            public final void invoke(boolean z10) {
                                AutoScrollingChipRowKt.AutoScrollingChipRow_6PoWaU8$lambda$3(u2.z0.this, z10);
                            }
                        };
                        qVar.h0(L2);
                    }
                    AutoScrollingChipRowKt.PromptChip(text, aVar, (ho.l) L2, null, qVar, 384, 8);
                    AutoScrollingChipRow_6PoWaU8$lambda$82 = AutoScrollingChipRowKt.AutoScrollingChipRow_6PoWaU8$lambda$8(z0Var);
                    if (i10 == ig.f.y(AutoScrollingChipRow_6PoWaU8$lambda$82)) {
                        qVar.X(1022255678);
                        boolean f12 = qVar.f(z0Var) | qVar.f(zVar) | qVar.h(d0Var) | qVar.c(f10);
                        Object L3 = qVar.L();
                        if (f12 || L3 == obj) {
                            Object autoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1 = new AutoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1(zVar, d0Var, z0Var, f10, null);
                            qVar.h0(autoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1);
                            L3 = autoScrollingChipRowKt$AutoScrollingChipRow$3$1$2$3$1;
                        }
                        u2.r.f((ho.p) L3, sn.z.f31622a, qVar);
                        qVar.p(false);
                    } else {
                        qVar.X(1022986999);
                        qVar.p(false);
                    }
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

    public static final Object AutoScrollingChipRow_6PoWaU8$lambda$11$0$0(int i10, ChipItem chipItem) {
        chipItem.getClass();
        return chipItem.getId();
    }

    public static final sn.z AutoScrollingChipRow_6PoWaU8$lambda$13(List list, ho.l lVar, i3.t tVar, float f10, float f11, int i10, int i11, u2.m mVar, int i12) {
        m1776AutoScrollingChipRow6PoWaU8(list, lVar, tVar, f10, f11, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final boolean AutoScrollingChipRow_6PoWaU8$lambda$2(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void AutoScrollingChipRow_6PoWaU8$lambda$3(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    private static final List<ChipItem> AutoScrollingChipRow_6PoWaU8$lambda$6(u2.z0 z0Var) {
        return (List) z0Var.getValue();
    }

    public static final List<ChipItem> AutoScrollingChipRow_6PoWaU8$lambda$8(u2.z0 z0Var) {
        return (List) z0Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromptChip(String str, ho.a aVar, ho.l lVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        u2.q qVar;
        i3.t tVar3;
        u2.r1 r10;
        i3.t tVar4;
        boolean z10;
        int i14;
        int i15;
        int i16;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1491623406);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i17 = i11 & 8;
        if (i17 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            boolean z11 = true;
            if ((i12 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar2.O(i12 & 1, z6)) {
                if (i17 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                Object L = qVar2.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = j0.c.o(qVar2);
                }
                p1.l lVar2 = (p1.l) L;
                if ((i12 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L2 = qVar2.L();
                if (z10 || L2 == eVar) {
                    L2 = new AutoScrollingChipRowKt$PromptChip$1$1(lVar2, lVar, null);
                    qVar2.h0(L2);
                }
                u2.r.f((ho.p) L2, lVar2, qVar2);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                s4.y0 baseRegular400 = echoTheme.getTypography(qVar2, 6).getBaseRegular400(qVar2, 0);
                long v9 = ib.i.v(6, 0, echoTheme, qVar2, qVar2);
                i3.t tVar5 = tVar4;
                i3.t n2 = l1.n.n(l1.n.j(1, echoTheme.getColors(qVar2, 6).getBorder().getSeptenaryAlpha(qVar2, 0), l1.n.h(m3.h.c(tVar4, echoTheme.getShapes(qVar2, 6).getFull(qVar2, 0)), echoTheme.getColors(qVar2, 6).getFill().getDenaryAlpha(qVar2, 0), p3.h0.f26395b), echoTheme.getShapes(qVar2, 6).getFull(qVar2, 0)), lVar2, e5.b(t2.u.P, 3, ib.i.b(6, 0, echoTheme, qVar2, qVar2), false), false, new p4.k(0), aVar, 12);
                int i18 = i12 & 14;
                if (i18 != 4) {
                    z11 = false;
                }
                Object L3 = qVar2.L();
                if (z11 || L3 == eVar) {
                    L3 = new g(str, 0);
                    qVar2.h0(L3);
                }
                qVar = qVar2;
                j7.d(str, r1.d.F(p4.q.c(n2, false, (ho.l) L3), echoTheme.getSpacings(qVar2, 6).getX4(), echoTheme.getSpacings(qVar2, 6).getX2()), v9, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, baseRegular400, qVar, i18, 0, 131064);
                tVar3 = tVar5;
            } else {
                qVar = qVar2;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.collections.k0(str, aVar, lVar, tVar3, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z112 = true;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z PromptChip$lambda$2$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z PromptChip$lambda$3(String str, ho.a aVar, ho.l lVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        PromptChip(str, aVar, lVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.a0] */
    public static final Object autoScroll(n1.d3 d3Var, float f10, wn.c<? super sn.z> cVar) {
        Object a10 = d3Var.a(l1.m1.f20999c, new AutoScrollingChipRowKt$autoScroll$2(f10, new Object(), null), cVar);
        if (a10 == xn.a.f37986a) {
            return a10;
        }
        return sn.z.f31622a;
    }
}
