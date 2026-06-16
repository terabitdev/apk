package io.elevenlabs.ui.components;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.compositionlocal.LocalSnapshotTestsContextKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¹\u0001\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\"\b\u0002\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00132\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aÍ\u0001\u0010\u0018\u001a\u00020\u000b2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\"\b\u0002\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00132\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/Function0;", "Lad/i;", "imageRequest", "Li3/t;", "modifier", "Lxk/a;", "component", "Lvk/i;", "imageOptions", "Lkotlin/Function1;", "Lwk/e;", "Lsn/z;", "onImageStateChanged", "Lu3/c;", "previewPlaceholder", "Lkotlin/Function2;", "Lr1/s;", "Lwk/b;", "loading", "Lkotlin/Function3;", "Lwk/d;", FirebaseAnalytics.Param.SUCCESS, "Lwk/a;", "failure", "LandscapistCoilImage", "(Lho/a;Li3/t;Lxk/a;Lvk/i;Lho/l;Lu3/c;Lho/r;Lho/s;Lho/r;Lu2/m;II)V", "", "imageModel", "Lpc/c;", "requestListener", "(Lho/a;Li3/t;Lxk/a;Lho/a;Lvk/i;Lho/l;Lu3/c;Lho/r;Lho/s;Lho/r;Lu2/m;II)V", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LandscapistImageKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LandscapistCoilImage(ho.a aVar, i3.t tVar, xk.a aVar2, ho.a aVar3, vk.i iVar, ho.l lVar, u3.c cVar, ho.r rVar, ho.s sVar, ho.r rVar2, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        xk.a aVar4;
        int i14;
        ho.a aVar5;
        int i15;
        int i16;
        vk.i iVar2;
        int i17;
        int i18;
        ho.l lVar2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z6;
        u2.q qVar;
        i3.t tVar2;
        ho.r rVar3;
        ho.r rVar4;
        xk.a aVar6;
        ho.a aVar7;
        vk.i iVar3;
        ho.l lVar3;
        ho.s sVar2;
        u2.r1 r10;
        i3.t tVar3;
        xk.a aVar8;
        vk.i iVar4;
        ho.l lVar4;
        ho.r rVar5;
        ho.s sVar3;
        ho.r rVar6;
        i3.t tVar4;
        ho.a aVar9;
        ho.l lVar5;
        ho.r rVar7;
        ho.s sVar4;
        boolean z10;
        xk.a aVar10;
        vk.i iVar5;
        boolean z11;
        vk.i iVar6;
        boolean h10;
        int i30;
        int i31;
        int i32;
        aVar.getClass();
        cVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(328172490);
        if ((i10 & 6) == 0) {
            if (qVar2.h(aVar)) {
                i32 = 4;
            } else {
                i32 = 2;
            }
            i12 = i32 | i10;
        } else {
            i12 = i10;
        }
        int i33 = i11 & 2;
        if (i33 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar2.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i10 & 384) != 0) {
                if ((i11 & 4) == 0) {
                    aVar4 = aVar2;
                    if (qVar2.f(aVar4)) {
                        i31 = RpcError.MAX_MESSAGE_BYTES;
                        i12 |= i31;
                    }
                } else {
                    aVar4 = aVar2;
                }
                i31 = 128;
                i12 |= i31;
            } else {
                aVar4 = aVar2;
            }
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                aVar5 = aVar3;
                if (qVar2.h(aVar5)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 16;
                if (i16 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    iVar2 = iVar;
                    if (qVar2.f(iVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 32;
                    if (i18 == 0) {
                        i12 |= 196608;
                    } else if ((196608 & i10) == 0) {
                        lVar2 = lVar;
                        if (qVar2.h(lVar2)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                        if ((1572864 & i10) == 0) {
                            if ((2097152 & i10) == 0) {
                                h10 = qVar2.f(cVar);
                            } else {
                                h10 = qVar2.h(cVar);
                            }
                            if (h10) {
                                i30 = 1048576;
                            } else {
                                i30 = 524288;
                            }
                            i12 |= i30;
                        }
                        i20 = i11 & 128;
                        if (i20 != 0) {
                            i21 = i12 | 12582912;
                        } else {
                            int i34 = i12;
                            if ((i10 & 12582912) == 0) {
                                if (qVar2.h(rVar)) {
                                    i22 = 8388608;
                                } else {
                                    i22 = 4194304;
                                }
                                i21 = i34 | i22;
                            } else {
                                i21 = i34;
                            }
                        }
                        i23 = i11 & RpcError.MAX_MESSAGE_BYTES;
                        if (i23 != 0) {
                            i21 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            i24 = i23;
                            if (qVar2.h(sVar)) {
                                i25 = 67108864;
                            } else {
                                i25 = 33554432;
                            }
                            i21 |= i25;
                            i26 = i11 & 512;
                            if (i26 == 0) {
                                i21 |= 805306368;
                                i27 = i26;
                            } else if ((i10 & 805306368) == 0) {
                                i27 = i26;
                                if (qVar2.h(rVar2)) {
                                    i28 = 536870912;
                                } else {
                                    i28 = 268435456;
                                }
                                i21 |= i28;
                            } else {
                                i27 = i26;
                            }
                            i29 = i21;
                            if ((i29 & 306783379) == 306783378) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!qVar2.O(i29 & 1, z6)) {
                                qVar2.T();
                                if ((i10 & 1) != 0 && !qVar2.y()) {
                                    qVar2.R();
                                    if ((i11 & 4) != 0) {
                                        i29 &= -897;
                                    }
                                    rVar7 = rVar;
                                    sVar4 = sVar;
                                    rVar6 = rVar2;
                                    aVar9 = aVar5;
                                    iVar5 = iVar2;
                                    lVar5 = lVar2;
                                    z10 = true;
                                    tVar4 = tVar;
                                    aVar10 = aVar4;
                                } else {
                                    if (i33 != 0) {
                                        tVar3 = i3.q.f13017a;
                                    } else {
                                        tVar3 = tVar;
                                    }
                                    if ((i11 & 4) != 0) {
                                        aVar8 = g0.c.D(ComposableSingletons$LandscapistImageKt.INSTANCE.getLambda$2006001457$ui_release(), qVar2);
                                        i29 &= -897;
                                    } else {
                                        aVar8 = aVar4;
                                    }
                                    if (i14 != 0) {
                                        aVar5 = null;
                                    }
                                    if (i16 != 0) {
                                        iVar4 = new vk.i(null, 0L, 127);
                                    } else {
                                        iVar4 = iVar2;
                                    }
                                    if (i18 != 0) {
                                        Object L = qVar2.L();
                                        if (L == u2.l.f33918a) {
                                            L = new v0(5);
                                            qVar2.h0(L);
                                        }
                                        lVar4 = (ho.l) L;
                                    } else {
                                        lVar4 = lVar2;
                                    }
                                    if (i20 != 0) {
                                        rVar5 = null;
                                    } else {
                                        rVar5 = rVar;
                                    }
                                    if (i24 != 0) {
                                        sVar3 = null;
                                    } else {
                                        sVar3 = sVar;
                                    }
                                    if (i27 != 0) {
                                        tVar4 = tVar3;
                                        rVar6 = null;
                                    } else {
                                        rVar6 = rVar2;
                                        tVar4 = tVar3;
                                    }
                                    aVar9 = aVar5;
                                    lVar5 = lVar4;
                                    rVar7 = rVar5;
                                    sVar4 = sVar3;
                                    z10 = true;
                                    aVar10 = aVar8;
                                    iVar5 = iVar4;
                                }
                                qVar2.q();
                                if (((Boolean) qVar2.j(i4.w1.f13252a)).booleanValue()) {
                                    qVar2.X(1241757918);
                                    z11 = false;
                                } else {
                                    z11 = false;
                                    qVar2.X(1841173169);
                                    z10 = ((Boolean) qVar2.j(LocalSnapshotTestsContextKt.getLocalSnapshotTestsContext())).booleanValue();
                                }
                                qVar2.p(z11);
                                if (z10) {
                                    qVar2.X(1241841753);
                                    int i35 = i29;
                                    qVar = qVar2;
                                    l1.n.c(cVar, iVar5.f35660b, tVar4, iVar5.f35659a, iVar5.f35661c, iVar5.f35663e, iVar5.f35662d, qVar, u3.c.$stable | ((i35 >> 18) & 14) | ((i35 << 3) & 896), 0);
                                    qVar.p(false);
                                    iVar6 = iVar5;
                                } else {
                                    qVar = qVar2;
                                    int i36 = i29;
                                    qVar.X(1242202655);
                                    int i37 = i36 << 3;
                                    iVar6 = iVar5;
                                    ig.f.a(aVar, tVar4, null, aVar10, aVar9, iVar6, lVar5, rVar7, sVar4, rVar6, qVar, (i36 & 126) | (i37 & 7168) | (57344 & i37) | (458752 & i37) | (3670016 & i37) | (234881024 & i37) | (i37 & 1879048192), (i36 >> 27) & 14);
                                    qVar.p(false);
                                }
                                tVar2 = tVar4;
                                aVar6 = aVar10;
                                aVar7 = aVar9;
                                iVar3 = iVar6;
                                lVar3 = lVar5;
                                rVar3 = rVar7;
                                sVar2 = sVar4;
                                rVar4 = rVar6;
                            } else {
                                qVar = qVar2;
                                qVar.R();
                                tVar2 = tVar;
                                rVar3 = rVar;
                                rVar4 = rVar2;
                                aVar6 = aVar4;
                                aVar7 = aVar5;
                                iVar3 = iVar2;
                                lVar3 = lVar2;
                                sVar2 = sVar;
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.f(aVar, tVar2, aVar6, aVar7, iVar3, lVar3, cVar, rVar3, sVar2, rVar4, i10, i11);
                                return;
                            }
                            return;
                        }
                        i24 = i23;
                        i26 = i11 & 512;
                        if (i26 == 0) {
                        }
                        i29 = i21;
                        if ((i29 & 306783379) == 306783378) {
                        }
                        if (!qVar2.O(i29 & 1, z6)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    lVar2 = lVar;
                    if ((1572864 & i10) == 0) {
                    }
                    i20 = i11 & 128;
                    if (i20 != 0) {
                    }
                    i23 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i23 != 0) {
                    }
                    i24 = i23;
                    i26 = i11 & 512;
                    if (i26 == 0) {
                    }
                    i29 = i21;
                    if ((i29 & 306783379) == 306783378) {
                    }
                    if (!qVar2.O(i29 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                iVar2 = iVar;
                i18 = i11 & 32;
                if (i18 == 0) {
                }
                lVar2 = lVar;
                if ((1572864 & i10) == 0) {
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                }
                i23 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i23 != 0) {
                }
                i24 = i23;
                i26 = i11 & 512;
                if (i26 == 0) {
                }
                i29 = i21;
                if ((i29 & 306783379) == 306783378) {
                }
                if (!qVar2.O(i29 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            aVar5 = aVar3;
            i16 = i11 & 16;
            if (i16 != 0) {
            }
            iVar2 = iVar;
            i18 = i11 & 32;
            if (i18 == 0) {
            }
            lVar2 = lVar;
            if ((1572864 & i10) == 0) {
            }
            i20 = i11 & 128;
            if (i20 != 0) {
            }
            i23 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i23 != 0) {
            }
            i24 = i23;
            i26 = i11 & 512;
            if (i26 == 0) {
            }
            i29 = i21;
            if ((i29 & 306783379) == 306783378) {
            }
            if (!qVar2.O(i29 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        if ((i10 & 384) != 0) {
        }
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        aVar5 = aVar3;
        i16 = i11 & 16;
        if (i16 != 0) {
        }
        iVar2 = iVar;
        i18 = i11 & 32;
        if (i18 == 0) {
        }
        lVar2 = lVar;
        if ((1572864 & i10) == 0) {
        }
        i20 = i11 & 128;
        if (i20 != 0) {
        }
        i23 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i23 != 0) {
        }
        i24 = i23;
        i26 = i11 & 512;
        if (i26 == 0) {
        }
        i29 = i21;
        if ((i29 & 306783379) == 306783378) {
        }
        if (!qVar2.O(i29 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z LandscapistCoilImage$lambda$0$0(wk.e eVar) {
        eVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z LandscapistCoilImage$lambda$1(ho.a aVar, i3.t tVar, xk.a aVar2, vk.i iVar, ho.l lVar, u3.c cVar, ho.r rVar, ho.s sVar, ho.r rVar2, int i10, int i11, u2.m mVar, int i12) {
        LandscapistCoilImage(aVar, tVar, aVar2, iVar, lVar, cVar, rVar, sVar, rVar2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z LandscapistCoilImage$lambda$2$0(wk.e eVar) {
        eVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z LandscapistCoilImage$lambda$3(ho.a aVar, i3.t tVar, xk.a aVar2, ho.a aVar3, vk.i iVar, ho.l lVar, u3.c cVar, ho.r rVar, ho.s sVar, ho.r rVar2, int i10, int i11, u2.m mVar, int i12) {
        LandscapistCoilImage(aVar, tVar, aVar2, aVar3, iVar, lVar, cVar, rVar, sVar, rVar2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LandscapistCoilImage(ho.a aVar, i3.t tVar, xk.a aVar2, vk.i iVar, ho.l lVar, u3.c cVar, ho.r rVar, ho.s sVar, ho.r rVar2, u2.m mVar, int i10, int i11) {
        int i12;
        xk.a aVar3;
        int i13;
        vk.i iVar2;
        int i14;
        ho.l lVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        i3.t tVar2;
        ho.s sVar2;
        vk.i iVar3;
        u2.q qVar;
        ho.l lVar3;
        ho.r rVar3;
        ho.r rVar4;
        u2.r1 r10;
        xk.a aVar4;
        int i21;
        vk.i iVar4;
        ho.l lVar4;
        ho.r rVar5;
        i3.t tVar3;
        xk.a aVar5;
        vk.i iVar5;
        ho.l lVar5;
        ho.r rVar6;
        ho.s sVar3;
        boolean z6;
        vk.i iVar6;
        int i22;
        aVar.getClass();
        cVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1654628202);
        if ((i10 & 6) == 0) {
            i12 = (qVar2.h(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= qVar2.f(tVar) ? 32 : 16;
            if ((i10 & 384) != 0) {
                if ((i11 & 4) == 0) {
                    aVar3 = aVar2;
                    if (qVar2.f(aVar3)) {
                        i22 = RpcError.MAX_MESSAGE_BYTES;
                        i12 |= i22;
                    }
                } else {
                    aVar3 = aVar2;
                }
                i22 = 128;
                i12 |= i22;
            } else {
                aVar3 = aVar2;
            }
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                iVar2 = iVar;
                i12 |= qVar2.f(iVar2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                i14 = i11 & 16;
                if (i14 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    lVar2 = lVar;
                    i12 |= qVar2.h(lVar2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    if ((196608 & i10) == 0) {
                        i12 |= (262144 & i10) == 0 ? qVar2.f(cVar) : qVar2.h(cVar) ? 131072 : 65536;
                    }
                    i15 = i11 & 64;
                    if (i15 == 0) {
                        i12 |= 1572864;
                    } else if ((1572864 & i10) == 0) {
                        i12 |= qVar2.h(rVar) ? 1048576 : 524288;
                        i16 = i11 & 128;
                        if (i16 != 0) {
                            i17 = i12 | 12582912;
                        } else {
                            int i24 = i12;
                            if ((i10 & 12582912) == 0) {
                                i17 = i24 | (qVar2.h(sVar) ? 8388608 : 4194304);
                            } else {
                                i17 = i24;
                            }
                        }
                        i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                        if (i18 != 0) {
                            i17 |= 100663296;
                            i19 = i18;
                        } else if ((i10 & 100663296) == 0) {
                            i19 = i18;
                            i17 |= qVar2.h(rVar2) ? 67108864 : 33554432;
                        } else {
                            i19 = i18;
                        }
                        i20 = i17;
                        boolean z10 = true;
                        if (qVar2.O(i20 & 1, (i20 & 38347923) != 38347922)) {
                            qVar2.T();
                            if ((i10 & 1) != 0 && !qVar2.y()) {
                                qVar2.R();
                                if ((i11 & 4) != 0) {
                                    i20 &= -897;
                                }
                                tVar3 = tVar;
                                rVar6 = rVar;
                                sVar3 = sVar;
                                rVar5 = rVar2;
                                aVar5 = aVar3;
                                iVar5 = iVar2;
                                lVar5 = lVar2;
                            } else {
                                i3.t tVar4 = i23 != 0 ? i3.q.f13017a : tVar;
                                if ((i11 & 4) != 0) {
                                    aVar4 = g0.c.D(ComposableSingletons$LandscapistImageKt.INSTANCE.getLambda$1760348349$ui_release(), qVar2);
                                    i20 &= -897;
                                } else {
                                    aVar4 = aVar3;
                                }
                                if (i13 != 0) {
                                    i21 = i16;
                                    iVar4 = new vk.i(null, 0L, 127);
                                } else {
                                    i21 = i16;
                                    iVar4 = iVar2;
                                }
                                if (i14 != 0) {
                                    Object L = qVar2.L();
                                    if (L == u2.l.f33918a) {
                                        L = new v0(6);
                                        qVar2.h0(L);
                                    }
                                    lVar4 = (ho.l) L;
                                } else {
                                    lVar4 = lVar2;
                                }
                                ho.r rVar7 = i15 != 0 ? null : rVar;
                                ho.s sVar4 = i21 != 0 ? null : sVar;
                                if (i19 != 0) {
                                    tVar3 = tVar4;
                                    aVar5 = aVar4;
                                    rVar5 = null;
                                } else {
                                    rVar5 = rVar2;
                                    tVar3 = tVar4;
                                    aVar5 = aVar4;
                                }
                                iVar5 = iVar4;
                                lVar5 = lVar4;
                                rVar6 = rVar7;
                                sVar3 = sVar4;
                            }
                            qVar2.q();
                            if (((Boolean) qVar2.j(i4.w1.f13252a)).booleanValue()) {
                                qVar2.X(311514834);
                                z6 = false;
                            } else {
                                z6 = false;
                                qVar2.X(-959781315);
                                z10 = ((Boolean) qVar2.j(LocalSnapshotTestsContextKt.getLocalSnapshotTestsContext())).booleanValue();
                            }
                            qVar2.p(z6);
                            if (z10) {
                                qVar2.X(311598669);
                                l1.n.c(cVar, iVar5.f35660b, tVar3, iVar5.f35659a, iVar5.f35661c, iVar5.f35663e, iVar5.f35662d, qVar2, u3.c.$stable | ((i20 >> 15) & 14) | ((i20 << 3) & 896), 0);
                                qVar2.p(false);
                                iVar6 = iVar5;
                            } else {
                                qVar2.X(311958238);
                                int i25 = i20 & 126;
                                int i26 = i20 << 3;
                                iVar6 = iVar5;
                                ig.f.b(aVar, tVar3, null, aVar5, iVar6, lVar5, null, rVar6, sVar3, rVar5, qVar2, i25 | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (29360128 & i26) | (234881024 & i26) | (i26 & 1879048192), 68);
                                qVar2.p(false);
                            }
                            qVar = qVar2;
                            tVar2 = tVar3;
                            aVar3 = aVar5;
                            iVar3 = iVar6;
                            lVar3 = lVar5;
                            rVar3 = rVar6;
                            sVar2 = sVar3;
                            rVar4 = rVar5;
                        } else {
                            qVar2.R();
                            tVar2 = tVar;
                            sVar2 = sVar;
                            iVar3 = iVar2;
                            qVar = qVar2;
                            lVar3 = lVar2;
                            rVar3 = rVar;
                            rVar4 = rVar2;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.h(aVar, tVar2, aVar3, iVar3, lVar3, cVar, rVar3, sVar2, rVar4, i10, i11);
                            return;
                        }
                        return;
                    }
                    i16 = i11 & 128;
                    if (i16 != 0) {
                    }
                    i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i18 != 0) {
                    }
                    i20 = i17;
                    boolean z102 = true;
                    if (qVar2.O(i20 & 1, (i20 & 38347923) != 38347922)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                lVar2 = lVar;
                if ((196608 & i10) == 0) {
                }
                i15 = i11 & 64;
                if (i15 == 0) {
                }
                i16 = i11 & 128;
                if (i16 != 0) {
                }
                i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i18 != 0) {
                }
                i20 = i17;
                boolean z1022 = true;
                if (qVar2.O(i20 & 1, (i20 & 38347923) != 38347922)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            iVar2 = iVar;
            i14 = i11 & 16;
            if (i14 != 0) {
            }
            lVar2 = lVar;
            if ((196608 & i10) == 0) {
            }
            i15 = i11 & 64;
            if (i15 == 0) {
            }
            i16 = i11 & 128;
            if (i16 != 0) {
            }
            i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i18 != 0) {
            }
            i20 = i17;
            boolean z10222 = true;
            if (qVar2.O(i20 & 1, (i20 & 38347923) != 38347922)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        if ((i10 & 384) != 0) {
        }
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        iVar2 = iVar;
        i14 = i11 & 16;
        if (i14 != 0) {
        }
        lVar2 = lVar;
        if ((196608 & i10) == 0) {
        }
        i15 = i11 & 64;
        if (i15 == 0) {
        }
        i16 = i11 & 128;
        if (i16 != 0) {
        }
        i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i18 != 0) {
        }
        i20 = i17;
        boolean z102222 = true;
        if (qVar2.O(i20 & 1, (i20 & 38347923) != 38347922)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }
}
