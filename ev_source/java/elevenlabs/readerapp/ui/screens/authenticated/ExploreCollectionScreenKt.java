package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.CollectionCategory;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.ExploreCollectionDetails;
import io.elevenlabs.domain.model.ExploreKt;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.components.HandleUiActionKt;
import io.elevenlabs.readerapp.ui.components.PaletteUtilsKt;
import io.elevenlabs.readerapp.ui.components.explore.BookCoverSize;
import io.elevenlabs.readerapp.ui.components.explore.LocalExplorePricesKt;
import io.elevenlabs.readerapp.ui.models.UiAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.CollectionDetailHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements.ExploreLargeGridCollectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.series.ExploreSeriesScreenKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.EchoButtonSize;
import io.elevenlabs.ui.components.EchoButtonVariant;
import io.elevenlabs.ui.components.EchoIconButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.components.EchoBackButtonKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.extensions.GlassModifiersKt;
import io.elevenlabs.ui.extensions.GlassState;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import k6.m2;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.d2;
import r1.l2;
import r1.m1;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\u001a]\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0087\u0001\u0010\"\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a\u0081\u0001\u0010&\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010'\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010)\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010(\u001a\u000f\u0010*\u001a\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010(¨\u0006/²\u0006\u0010\u0010+\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010.\u001a\u00020,8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "collectionId", "Lkotlin/Function0;", "", "onGoBack", "Lkotlin/Function1;", "Lsn/z;", "onNavigateToRead", "Lkotlin/Function2;", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "onNavigateToPlayer", "Lio/elevenlabs/readerapp/ui/screens/authenticated/ExploreCollectionViewModel;", "vm", "ExploreCollectionScreen", "(Ljava/lang/String;Lho/a;Lho/l;Lho/p;Lio/elevenlabs/readerapp/ui/screens/authenticated/ExploreCollectionViewModel;Lu2/m;II)V", "Lio/elevenlabs/domain/model/ExploreCollectionDetails;", "collectionDetails", "Lua/b;", "Lio/elevenlabs/domain/model/ExploreRead;", "itemsPagingItems", "onShareClick", "onPreviewClick", "playingPreviewReadId", "miniPlayer", "ExploreCollectionScreenUI", "(Lio/elevenlabs/domain/model/ExploreCollectionDetails;Lua/b;Lho/a;Lho/l;Lho/a;Lho/l;Ljava/lang/String;Lho/p;Lu2/m;II)V", "Lp3/x;", "headerColor", "Li3/t;", "modifier", "Lh5/f;", "topPadding", "CollectionDetailsScaffold-lQd7feU", "(Lio/elevenlabs/domain/model/ExploreCollectionDetails;JLua/b;Li3/t;Lho/l;Lho/l;Ljava/lang/String;Lho/p;FLu2/m;II)V", "CollectionDetailsScaffold", "bottomPadding", "CollectionDetailsContent-iP_jeOc", "(Lio/elevenlabs/domain/model/ExploreCollectionDetails;JLua/b;Lho/l;Li3/t;Lho/l;Ljava/lang/String;FFLu2/m;II)V", "CollectionDetailsContent", "Preview_ExploreCollectionScreen_Loading", "(Lu2/m;I)V", "Preview_ExploreCollectionScreen_Error", "Preview_ExploreCollectionScreen_Content", "linkToShare", "", "headerHeight", "miniPlayerHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreCollectionScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008a  */
    /* renamed from: CollectionDetailsContent-iP_jeOc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1210CollectionDetailsContentiP_jeOc(final ExploreCollectionDetails exploreCollectionDetails, final long j4, final ua.b bVar, final ho.l lVar, i3.t tVar, ho.l lVar2, String str, final float f10, float f11, u2.m mVar, final int i10, final int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        ho.l lVar3;
        int i15;
        int i16;
        String str2;
        int i17;
        float f12;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z6;
        u2.q qVar;
        final float f13;
        final i3.t tVar3;
        final ho.l lVar4;
        final String str3;
        r1 r10;
        i3.t tVar4;
        final ho.l lVar5;
        final String str4;
        final float f14;
        int i22;
        int i23;
        boolean h10;
        int i24;
        int i25;
        int i26;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-533933513);
        if ((i10 & 6) == 0) {
            if (qVar2.h(exploreCollectionDetails)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i12 = i26 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.e(j4)) {
                i25 = 32;
            } else {
                i25 = 16;
            }
            i12 |= i25;
        }
        if ((i10 & 384) == 0) {
            if ((i10 & 512) == 0) {
                h10 = qVar2.f(bVar);
            } else {
                h10 = qVar2.h(bVar);
            }
            if (h10) {
                i24 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i24 = 128;
            }
            i12 |= i24;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(lVar)) {
                i23 = 2048;
            } else {
                i23 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i23;
        }
        int i27 = i11 & 16;
        if (i27 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 32;
            if (i14 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
                lVar3 = lVar2;
                if (qVar2.h(lVar3)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
                i16 = i11 & 64;
                if (i16 != 0) {
                    i12 |= 1572864;
                } else if ((1572864 & i10) == 0) {
                    str2 = str;
                    if (qVar2.f(str2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                    if ((12582912 & i10) != 0) {
                        f12 = f10;
                        if (qVar2.c(f12)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i12 |= i22;
                    } else {
                        f12 = f10;
                    }
                    int i28 = i12;
                    i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i18 == 0) {
                        i20 = i28 | 100663296;
                        i19 = i18;
                    } else if ((i10 & 100663296) == 0) {
                        i19 = i18;
                        if (qVar2.c(f11)) {
                            i21 = 67108864;
                        } else {
                            i21 = 33554432;
                        }
                        i20 = i28 | i21;
                    } else {
                        i19 = i18;
                        i20 = i28;
                    }
                    if ((i20 & 38347923) == 38347922) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i20 & 1, z6)) {
                        if (i27 != 0) {
                            tVar4 = i3.q.f13017a;
                        } else {
                            tVar4 = tVar2;
                        }
                        if (i14 != 0) {
                            lVar5 = null;
                        } else {
                            lVar5 = lVar3;
                        }
                        if (i16 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i19 != 0) {
                            f14 = 0;
                        } else {
                            f14 = f11;
                        }
                        final float f15 = f12;
                        qVar = qVar2;
                        r1.d.a(p2.e(tVar4, 1.0f), null, false, c3.k.d(640210189, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.f0
                            @Override // ho.q
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                sn.z CollectionDetailsContent_iP_jeOc$lambda$0;
                                int intValue = ((Integer) obj3).intValue();
                                CollectionDetailsContent_iP_jeOc$lambda$0 = ExploreCollectionScreenKt.CollectionDetailsContent_iP_jeOc$lambda$0(f15, exploreCollectionDetails, j4, f14, bVar, lVar, lVar5, str4, (r1.u) obj, (u2.m) obj2, intValue);
                                return CollectionDetailsContent_iP_jeOc$lambda$0;
                            }
                        }, qVar2), qVar, 3072, 6);
                        f13 = f14;
                        lVar4 = lVar5;
                        str3 = str4;
                        tVar3 = tVar4;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        f13 = f11;
                        tVar3 = tVar2;
                        lVar4 = lVar3;
                        str3 = str2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.g0
                            @Override // ho.p
                            public final Object invoke(Object obj, Object obj2) {
                                sn.z CollectionDetailsContent_iP_jeOc$lambda$1;
                                CollectionDetailsContent_iP_jeOc$lambda$1 = ExploreCollectionScreenKt.CollectionDetailsContent_iP_jeOc$lambda$1(ExploreCollectionDetails.this, j4, bVar, lVar, tVar3, lVar4, str3, f10, f13, i10, i11, (u2.m) obj, ((Integer) obj2).intValue());
                                return CollectionDetailsContent_iP_jeOc$lambda$1;
                            }
                        };
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((12582912 & i10) != 0) {
                }
                int i282 = i12;
                i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i18 == 0) {
                }
                if ((i20 & 38347923) == 38347922) {
                }
                if (!qVar2.O(i20 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar3 = lVar2;
            i16 = i11 & 64;
            if (i16 != 0) {
            }
            str2 = str;
            if ((12582912 & i10) != 0) {
            }
            int i2822 = i12;
            i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i18 == 0) {
            }
            if ((i20 & 38347923) == 38347922) {
            }
            if (!qVar2.O(i20 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 32;
        if (i14 == 0) {
        }
        lVar3 = lVar2;
        i16 = i11 & 64;
        if (i16 != 0) {
        }
        str2 = str;
        if ((12582912 & i10) != 0) {
        }
        int i28222 = i12;
        i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i18 == 0) {
        }
        if ((i20 & 38347923) == 38347922) {
        }
        if (!qVar2.O(i20 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z CollectionDetailsContent_iP_jeOc$lambda$0(float f10, final ExploreCollectionDetails exploreCollectionDetails, final long j4, final float f11, final ua.b bVar, final ho.l lVar, final ho.l lVar2, final String str, r1.u uVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        uVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(uVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            sn.k m1405rememberGridLayout8Feqmps = ExploreLargeGridCollectionKt.m1405rememberGridLayout8Feqmps(((r1.v) uVar).d(), qVar, 0);
            final BookCoverSize bookCoverSize = (BookCoverSize) m1405rememberGridLayout8Feqmps.f31600a;
            final int intValue = ((Number) m1405rememberGridLayout8Feqmps.f31601b).intValue();
            i3.t e10 = p2.e(i3.q.f13017a, 1.0f);
            float x32 = EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX3();
            if (f10 >= x32) {
                x32 = f10;
            }
            d2 f12 = r1.d.f(t2.u.P, t2.u.P, t2.u.P, x32, 7);
            boolean h10 = qVar.h(exploreCollectionDetails) | qVar.e(j4) | qVar.c(f11) | qVar.h(bVar) | qVar.d(intValue) | qVar.d(bookCoverSize.ordinal()) | qVar.f(lVar) | qVar.f(lVar2) | qVar.f(str);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                ho.l lVar3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.a0
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        sn.z CollectionDetailsContent_iP_jeOc$lambda$0$0$0;
                        CollectionDetailsContent_iP_jeOc$lambda$0$0$0 = ExploreCollectionScreenKt.CollectionDetailsContent_iP_jeOc$lambda$0$0$0(ua.b.this, intValue, bookCoverSize, lVar, lVar2, str, exploreCollectionDetails, j4, f11, (t1.t) obj);
                        return CollectionDetailsContent_iP_jeOc$lambda$0$0$0;
                    }
                };
                qVar.h0(lVar3);
                L = lVar3;
            }
            rd.c1.c(e10, null, f12, false, null, null, null, false, null, (ho.l) L, qVar, 6, 506);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CollectionDetailsContent_iP_jeOc$lambda$0$0$0(ua.b bVar, int i10, BookCoverSize bookCoverSize, ho.l lVar, ho.l lVar2, String str, final ExploreCollectionDetails exploreCollectionDetails, final long j4, final float f10, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.b0
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                sn.z CollectionDetailsContent_iP_jeOc$lambda$0$0$0$0;
                int intValue = ((Integer) obj3).intValue();
                CollectionDetailsContent_iP_jeOc$lambda$0$0$0$0 = ExploreCollectionScreenKt.CollectionDetailsContent_iP_jeOc$lambda$0$0$0$0(ExploreCollectionDetails.this, j4, f10, (t1.b) obj, (u2.m) obj2, intValue);
                return CollectionDetailsContent_iP_jeOc$lambda$0$0$0$0;
            }
        }, true, -513455326), 3);
        ComposableSingletons$ExploreCollectionScreenKt composableSingletons$ExploreCollectionScreenKt = ComposableSingletons$ExploreCollectionScreenKt.INSTANCE;
        t1.t.c(tVar, null, null, composableSingletons$ExploreCollectionScreenKt.getLambda$1041201945$app_productionRelease(), 3);
        ExploreLargeGridCollectionKt.pagedBookGrid(tVar, bVar, i10, bookCoverSize, lVar, lVar2, str);
        if ((bVar.d().f32555a instanceof ta.r) && bVar.c() == 0) {
            t1.t.c(tVar, null, null, composableSingletons$ExploreCollectionScreenKt.m1190getLambda$382791107$app_productionRelease(), 3);
        }
        if (bVar.d().f32557c instanceof ta.r) {
            t1.t.c(tVar, null, null, composableSingletons$ExploreCollectionScreenKt.getLambda$2055464820$app_productionRelease(), 3);
        }
        return sn.z.f31622a;
    }

    public static final sn.z CollectionDetailsContent_iP_jeOc$lambda$0$0$0$0(ExploreCollectionDetails exploreCollectionDetails, long j4, float f10, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            CollectionDetailHeaderKt.m1378CollectionDetailHeaderZfqMctQ(exploreCollectionDetails.getTitle(), exploreCollectionDetails.getSubtitle(), exploreCollectionDetails.getDescription(), exploreCollectionDetails.getMeta(), j4, f10, null, qVar, 0, 64);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CollectionDetailsContent_iP_jeOc$lambda$1(ExploreCollectionDetails exploreCollectionDetails, long j4, ua.b bVar, ho.l lVar, i3.t tVar, ho.l lVar2, String str, float f10, float f11, int i10, int i11, u2.m mVar, int i12) {
        m1210CollectionDetailsContentiP_jeOc(exploreCollectionDetails, j4, bVar, lVar, tVar, lVar2, str, f10, f11, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: CollectionDetailsScaffold-lQd7feU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1211CollectionDetailsScaffoldlQd7feU(ExploreCollectionDetails exploreCollectionDetails, long j4, ua.b bVar, i3.t tVar, ho.l lVar, ho.l lVar2, String str, ho.p pVar, float f10, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        ho.l lVar3;
        int i15;
        int i16;
        String str2;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        i3.t tVar3;
        ho.l lVar4;
        u2.q qVar;
        String str3;
        float f11;
        r1 r10;
        i3.t tVar4;
        String str4;
        String str5;
        float f12;
        boolean z10;
        int i21;
        int i22;
        boolean h10;
        int i23;
        int i24;
        int i25;
        ho.p pVar2 = pVar;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(716534525);
        if ((i10 & 6) == 0) {
            if (qVar2.h(exploreCollectionDetails)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i12 = i25 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.e(j4)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i12 |= i24;
        }
        if ((i10 & 384) == 0) {
            if ((i10 & 512) == 0) {
                h10 = qVar2.f(bVar);
            } else {
                h10 = qVar2.h(bVar);
            }
            if (h10) {
                i23 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i23 = 128;
            }
            i12 |= i23;
        }
        int i26 = i11 & 8;
        if (i26 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            if ((i10 & 24576) == 0) {
                if (qVar2.h(lVar)) {
                    i22 = 16384;
                } else {
                    i22 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i22;
            }
            i14 = i11 & 32;
            if (i14 == 0) {
                i12 |= 196608;
            } else if ((196608 & i10) == 0) {
                lVar3 = lVar2;
                if (qVar2.h(lVar3)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
                i16 = i11 & 64;
                if (i16 != 0) {
                    i12 |= 1572864;
                } else if ((1572864 & i10) == 0) {
                    str2 = str;
                    if (qVar2.f(str2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                    if ((i10 & 12582912) == 0) {
                        if (qVar2.h(pVar2)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    }
                    i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                    if (i18 == 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        i19 = i18;
                        if (qVar2.c(f10)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                        if ((i12 & 38347923) != 38347922) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar2.O(i12 & 1, z6)) {
                            i3.q qVar3 = i3.q.f13017a;
                            if (i26 != 0) {
                                tVar4 = qVar3;
                            } else {
                                tVar4 = tVar2;
                            }
                            ho.l lVar5 = null;
                            if (i14 != 0) {
                                str4 = null;
                            } else {
                                str4 = null;
                                lVar5 = lVar3;
                            }
                            if (i16 != 0) {
                                str5 = str4;
                            } else {
                                str5 = str2;
                            }
                            if (i19 != 0) {
                                f12 = 0;
                            } else {
                                f12 = f10;
                            }
                            Object L = qVar2.L();
                            u2.e eVar = u2.l.f33918a;
                            if (L == eVar) {
                                L = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
                            }
                            u2.x0 x0Var = (u2.x0) L;
                            float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(CollectionDetailsScaffold_lQd7feU$lambda$1(x0Var), (u2.m) qVar2, 0);
                            i3.t d10 = p2.d(tVar4, 1.0f);
                            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                            int hashCode = Long.hashCode(qVar2.T);
                            c3.o l4 = qVar2.l();
                            i3.t c5 = i3.a.c(d10, qVar2);
                            h4.h.f11920i.getClass();
                            h4.f fVar = h4.g.f11903b;
                            qVar2.b0();
                            i3.t tVar5 = tVar4;
                            if (qVar2.S) {
                                qVar2.k(fVar);
                            } else {
                                qVar2.k0();
                            }
                            h4.e eVar2 = h4.g.f11907f;
                            u2.r.J(eVar2, a10, qVar2);
                            h4.e eVar3 = h4.g.f11906e;
                            u2.r.J(eVar3, l4, qVar2);
                            Integer valueOf = Integer.valueOf(hashCode);
                            h4.e eVar4 = h4.g.f11908g;
                            u2.r.y(qVar2, valueOf, eVar4);
                            h4.d dVar = h4.g.f11909h;
                            u2.r.F(dVar, qVar2);
                            h4.e eVar5 = h4.g.f11905d;
                            u2.r.J(eVar5, c5, qVar2);
                            EchoTheme echoTheme = EchoTheme.INSTANCE;
                            int i27 = EchoTheme.$stable;
                            ho.l lVar6 = lVar5;
                            long primary = echoTheme.getColors(qVar2, i27).getBackground().getPrimary(qVar2, EchoThemeColors.Background.$stable);
                            String str6 = str5;
                            if (1.0f > 0.0d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                s1.a.a("invalid weight; must be greater than zero");
                            }
                            m1 m1Var = new m1(1.0f, true);
                            i3.l lVar7 = i3.d.f12997a;
                            f4.f1 d11 = r1.p.d(lVar7, false);
                            int hashCode2 = Long.hashCode(qVar2.T);
                            c3.o l7 = qVar2.l();
                            i3.t c10 = i3.a.c(m1Var, qVar2);
                            qVar2.b0();
                            if (qVar2.S) {
                                qVar2.k(fVar);
                            } else {
                                qVar2.k0();
                            }
                            u2.r.J(eVar2, d11, qVar2);
                            u2.r.J(eVar3, l7, qVar2);
                            defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
                            u2.r.J(eVar5, c10, qVar2);
                            int i28 = i12;
                            m1210CollectionDetailsContentiP_jeOc(exploreCollectionDetails, j4, bVar, lVar, null, lVar6, str6, rememberPxToDp, f12, qVar2, (i12 & 126) | 512 | (i12 & 896) | ((i12 >> 3) & 7168) | (458752 & i12) | (3670016 & i12) | (234881024 & i12), 16);
                            i3.l lVar8 = i3.d.Z;
                            r1.t tVar6 = r1.t.f29349a;
                            r1.p.a(l1.n.g(p2.f(p2.e(tVar6.b(qVar3, lVar8), 1.0f), echoTheme.getSpacings(qVar2, i27).getX8()), p3.s.b(p3.t.Companion, ig.f.I(new p3.x(p3.x.b(t2.u.P, primary)), new p3.x(primary)), t2.u.P, t2.u.P, 14), null, 6), qVar2, 0);
                            i3.t b10 = tVar6.b(qVar3, lVar8);
                            Object L2 = qVar2.L();
                            if (L2 == eVar) {
                                L2 = new m(x0Var, 2);
                                qVar2.h0(L2);
                            }
                            i3.t q = f4.i0.q(b10, (ho.l) L2);
                            f4.f1 d12 = r1.p.d(lVar7, false);
                            int hashCode3 = Long.hashCode(qVar2.T);
                            c3.o l10 = qVar2.l();
                            i3.t c11 = i3.a.c(q, qVar2);
                            qVar2.b0();
                            if (qVar2.S) {
                                qVar2.k(fVar);
                            } else {
                                qVar2.k0();
                            }
                            u2.r.J(eVar2, d12, qVar2);
                            u2.r.J(eVar3, l10, qVar2);
                            defpackage.f.u(hashCode3, qVar2, eVar4, qVar2, dVar);
                            u2.r.J(eVar5, c11, qVar2);
                            pVar2 = pVar;
                            j0.c.r((i28 >> 21) & 14, pVar2, qVar2, true, true);
                            qVar2.p(true);
                            qVar = qVar2;
                            tVar3 = tVar5;
                            lVar4 = lVar6;
                            str3 = str6;
                            f11 = f12;
                        } else {
                            qVar2.R();
                            tVar3 = tVar2;
                            lVar4 = lVar3;
                            qVar = qVar2;
                            str3 = str2;
                            f11 = f10;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new h0(exploreCollectionDetails, j4, bVar, tVar3, lVar, lVar4, str3, pVar2, f11, i10, i11);
                            return;
                        }
                        return;
                    }
                    i19 = i18;
                    if ((i12 & 38347923) != 38347922) {
                    }
                    if (qVar2.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                str2 = str;
                if ((i10 & 12582912) == 0) {
                }
                i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
                if (i18 == 0) {
                }
                i19 = i18;
                if ((i12 & 38347923) != 38347922) {
                }
                if (qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            lVar3 = lVar2;
            i16 = i11 & 64;
            if (i16 != 0) {
            }
            str2 = str;
            if ((i10 & 12582912) == 0) {
            }
            i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
            if (i18 == 0) {
            }
            i19 = i18;
            if ((i12 & 38347923) != 38347922) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        if ((i10 & 24576) == 0) {
        }
        i14 = i11 & 32;
        if (i14 == 0) {
        }
        lVar3 = lVar2;
        i16 = i11 & 64;
        if (i16 != 0) {
        }
        str2 = str;
        if ((i10 & 12582912) == 0) {
        }
        i18 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i18 == 0) {
        }
        i19 = i18;
        if ((i12 & 38347923) != 38347922) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final int CollectionDetailsScaffold_lQd7feU$lambda$1(u2.x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void CollectionDetailsScaffold_lQd7feU$lambda$2(u2.x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final sn.z CollectionDetailsScaffold_lQd7feU$lambda$3$0$0$0(u2.x0 x0Var, h5.l lVar) {
        CollectionDetailsScaffold_lQd7feU$lambda$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z CollectionDetailsScaffold_lQd7feU$lambda$4(ExploreCollectionDetails exploreCollectionDetails, long j4, ua.b bVar, i3.t tVar, ho.l lVar, ho.l lVar2, String str, ho.p pVar, float f10, int i10, int i11, u2.m mVar, int i12) {
        m1211CollectionDetailsScaffoldlQd7feU(exploreCollectionDetails, j4, bVar, tVar, lVar, lVar2, str, pVar, f10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreCollectionScreen(String str, ho.a aVar, ho.l lVar, ho.p pVar, ExploreCollectionViewModel exploreCollectionViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        final ExploreCollectionViewModel exploreCollectionViewModel2;
        boolean z6;
        u2.q qVar;
        q7.c cVar;
        u2.q qVar2;
        boolean z10;
        boolean z11;
        Object L;
        u2.e eVar;
        boolean h10;
        Object L2;
        boolean z12;
        Object L3;
        boolean h11;
        Object L4;
        Object L5;
        u2.z0 z0Var;
        Object L6;
        ExploreCollectionDetails collectionDetails;
        CollectionCategory collectionCategory;
        boolean h12;
        Object L7;
        boolean h13;
        Object L8;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        pVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(1843172746);
        if ((i10 & 6) == 0) {
            if (qVar3.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.h(aVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.h(lVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.h(pVar)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                exploreCollectionViewModel2 = exploreCollectionViewModel;
                if (qVar3.h(exploreCollectionViewModel2)) {
                    i13 = 16384;
                    i12 |= i13;
                }
            } else {
                exploreCollectionViewModel2 = exploreCollectionViewModel;
            }
            i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i12 |= i13;
        } else {
            exploreCollectionViewModel2 = exploreCollectionViewModel;
        }
        int i18 = i12;
        boolean z13 = false;
        if ((i18 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i18 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 16) != 0) {
                    i18 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar3);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    qVar2 = qVar3;
                    i18 &= -57345;
                    exploreCollectionViewModel2 = (ExploreCollectionViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ExploreCollectionViewModel.class), a10, null, o6, cVar, qVar3);
                    qVar2.q();
                    ExploreCollectionState exploreCollectionState = (ExploreCollectionState) u2.r.o(exploreCollectionViewModel2.getStateFlow(), qVar2, 0).getValue();
                    ua.b a11 = ua.d.a(exploreCollectionViewModel2.getItemsPagingData(), qVar2);
                    boolean h14 = qVar2.h(exploreCollectionViewModel2);
                    if ((i18 & 14) != 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = h14 | z10;
                    L = qVar2.L();
                    eVar = u2.l.f33918a;
                    if (!z11 || L == eVar) {
                        L = new ExploreCollectionScreenKt$ExploreCollectionScreen$1$1(exploreCollectionViewModel2, str, null);
                        qVar2.h0(L);
                    }
                    u2.r.f((ho.p) L, str, qVar2);
                    UiAction<sn.z> triggerNavigateBack = exploreCollectionState.getTriggerNavigateBack();
                    h10 = qVar2.h(exploreCollectionViewModel2);
                    L2 = qVar2.L();
                    if (!h10 || L2 == eVar) {
                        L2 = new ExploreCollectionScreenKt$ExploreCollectionScreen$2$1(exploreCollectionViewModel2);
                        qVar2.h0(L2);
                    }
                    ho.a aVar2 = (ho.a) ((oo.g) L2);
                    if ((i18 & 112) != 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    L3 = qVar2.L();
                    if (!z12 || L3 == eVar) {
                        L3 = new l0(aVar, 6);
                        qVar2.h0(L3);
                    }
                    HandleUiActionKt.HandleUiAction(triggerNavigateBack, aVar2, (ho.l) L3, qVar2, 0);
                    h11 = qVar2.h(exploreCollectionViewModel2);
                    L4 = qVar2.L();
                    if (!h11 || L4 == eVar) {
                        final int i19 = 1;
                        L4 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.y
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                sn.z ExploreCollectionScreen$lambda$9$0;
                                u2.h0 ExploreCollectionScreen$lambda$3$0;
                                switch (i19) {
                                    case 0:
                                        ExploreCollectionScreen$lambda$9$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$9$0(exploreCollectionViewModel2, (ExploreRead) obj);
                                        return ExploreCollectionScreen$lambda$9$0;
                                    default:
                                        ExploreCollectionScreen$lambda$3$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$3$0(exploreCollectionViewModel2, (u2.i0) obj);
                                        return ExploreCollectionScreen$lambda$3$0;
                                }
                            }
                        };
                        qVar2.h0(L4);
                    }
                    u2.r.c(sn.z.f31622a, (ho.l) L4, qVar2);
                    L5 = qVar2.L();
                    if (L5 == eVar) {
                        L5 = u2.r.A(null);
                        qVar2.h0(L5);
                    }
                    z0Var = (u2.z0) L5;
                    String ExploreCollectionScreen$lambda$5 = ExploreCollectionScreen$lambda$5(z0Var);
                    L6 = qVar2.L();
                    if (L6 == eVar) {
                        L6 = new i0(z0Var, 0);
                        qVar2.h0(L6);
                    }
                    io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.ShareLinkHandler(ExploreCollectionScreen$lambda$5, (ho.a) L6, qVar2, 48);
                    collectionDetails = exploreCollectionState.getCollectionDetails();
                    if (collectionDetails == null) {
                        collectionCategory = collectionDetails.getCategory();
                    } else {
                        collectionCategory = null;
                    }
                    if (collectionCategory == CollectionCategory.Series) {
                        z13 = true;
                    }
                    h12 = qVar2.h(exploreCollectionState);
                    L7 = qVar2.L();
                    if (!h12 || L7 == eVar) {
                        L7 = new v(exploreCollectionState, z0Var, 1);
                        qVar2.h0(L7);
                    }
                    ho.a aVar3 = (ho.a) L7;
                    h13 = qVar2.h(exploreCollectionViewModel2);
                    L8 = qVar2.L();
                    if (!h13 || L8 == eVar) {
                        final int i20 = 0;
                        L8 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.y
                            @Override // ho.l
                            public final Object invoke(Object obj) {
                                sn.z ExploreCollectionScreen$lambda$9$0;
                                u2.h0 ExploreCollectionScreen$lambda$3$0;
                                switch (i20) {
                                    case 0:
                                        ExploreCollectionScreen$lambda$9$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$9$0(exploreCollectionViewModel2, (ExploreRead) obj);
                                        return ExploreCollectionScreen$lambda$9$0;
                                    default:
                                        ExploreCollectionScreen$lambda$3$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$3$0(exploreCollectionViewModel2, (u2.i0) obj);
                                        return ExploreCollectionScreen$lambda$3$0;
                                }
                            }
                        };
                        qVar2.h0(L8);
                    }
                    boolean z14 = z13;
                    qVar = qVar2;
                    u2.r.b(new fe.h0[]{LocalExplorePricesKt.getLocalExplorePrices().a(exploreCollectionState.getLocalizedPrices()), LocalExplorePricesKt.getLocalIsFreeUser().a(exploreCollectionState.isFreeUser())}, c3.k.d(406841930, true, new z(exploreCollectionState, exploreCollectionViewModel2, z14, a11, aVar, lVar, aVar3, (ho.l) L8, c3.k.d(-1878239711, true, new s(pVar, 1), qVar2)), qVar), qVar, 56);
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            qVar2 = qVar3;
            qVar2.q();
            ExploreCollectionState exploreCollectionState2 = (ExploreCollectionState) u2.r.o(exploreCollectionViewModel2.getStateFlow(), qVar2, 0).getValue();
            ua.b a112 = ua.d.a(exploreCollectionViewModel2.getItemsPagingData(), qVar2);
            boolean h142 = qVar2.h(exploreCollectionViewModel2);
            if ((i18 & 14) != 4) {
            }
            z11 = h142 | z10;
            L = qVar2.L();
            eVar = u2.l.f33918a;
            if (!z11) {
            }
            L = new ExploreCollectionScreenKt$ExploreCollectionScreen$1$1(exploreCollectionViewModel2, str, null);
            qVar2.h0(L);
            u2.r.f((ho.p) L, str, qVar2);
            UiAction<sn.z> triggerNavigateBack2 = exploreCollectionState2.getTriggerNavigateBack();
            h10 = qVar2.h(exploreCollectionViewModel2);
            L2 = qVar2.L();
            if (!h10) {
            }
            L2 = new ExploreCollectionScreenKt$ExploreCollectionScreen$2$1(exploreCollectionViewModel2);
            qVar2.h0(L2);
            ho.a aVar22 = (ho.a) ((oo.g) L2);
            if ((i18 & 112) != 32) {
            }
            L3 = qVar2.L();
            if (!z12) {
            }
            L3 = new l0(aVar, 6);
            qVar2.h0(L3);
            HandleUiActionKt.HandleUiAction(triggerNavigateBack2, aVar22, (ho.l) L3, qVar2, 0);
            h11 = qVar2.h(exploreCollectionViewModel2);
            L4 = qVar2.L();
            if (!h11) {
            }
            final int i192 = 1;
            L4 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.y
                @Override // ho.l
                public final Object invoke(Object obj) {
                    sn.z ExploreCollectionScreen$lambda$9$0;
                    u2.h0 ExploreCollectionScreen$lambda$3$0;
                    switch (i192) {
                        case 0:
                            ExploreCollectionScreen$lambda$9$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$9$0(exploreCollectionViewModel2, (ExploreRead) obj);
                            return ExploreCollectionScreen$lambda$9$0;
                        default:
                            ExploreCollectionScreen$lambda$3$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$3$0(exploreCollectionViewModel2, (u2.i0) obj);
                            return ExploreCollectionScreen$lambda$3$0;
                    }
                }
            };
            qVar2.h0(L4);
            u2.r.c(sn.z.f31622a, (ho.l) L4, qVar2);
            L5 = qVar2.L();
            if (L5 == eVar) {
            }
            z0Var = (u2.z0) L5;
            String ExploreCollectionScreen$lambda$52 = ExploreCollectionScreen$lambda$5(z0Var);
            L6 = qVar2.L();
            if (L6 == eVar) {
            }
            io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.ShareLinkHandler(ExploreCollectionScreen$lambda$52, (ho.a) L6, qVar2, 48);
            collectionDetails = exploreCollectionState2.getCollectionDetails();
            if (collectionDetails == null) {
            }
            if (collectionCategory == CollectionCategory.Series) {
            }
            h12 = qVar2.h(exploreCollectionState2);
            L7 = qVar2.L();
            if (!h12) {
            }
            L7 = new v(exploreCollectionState2, z0Var, 1);
            qVar2.h0(L7);
            ho.a aVar32 = (ho.a) L7;
            h13 = qVar2.h(exploreCollectionViewModel2);
            L8 = qVar2.L();
            if (!h13) {
            }
            final int i202 = 0;
            L8 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.y
                @Override // ho.l
                public final Object invoke(Object obj) {
                    sn.z ExploreCollectionScreen$lambda$9$0;
                    u2.h0 ExploreCollectionScreen$lambda$3$0;
                    switch (i202) {
                        case 0:
                            ExploreCollectionScreen$lambda$9$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$9$0(exploreCollectionViewModel2, (ExploreRead) obj);
                            return ExploreCollectionScreen$lambda$9$0;
                        default:
                            ExploreCollectionScreen$lambda$3$0 = ExploreCollectionScreenKt.ExploreCollectionScreen$lambda$3$0(exploreCollectionViewModel2, (u2.i0) obj);
                            return ExploreCollectionScreen$lambda$3$0;
                    }
                }
            };
            qVar2.h0(L8);
            boolean z142 = z13;
            qVar = qVar2;
            u2.r.b(new fe.h0[]{LocalExplorePricesKt.getLocalExplorePrices().a(exploreCollectionState2.getLocalizedPrices()), LocalExplorePricesKt.getLocalIsFreeUser().a(exploreCollectionState2.isFreeUser())}, c3.k.d(406841930, true, new z(exploreCollectionState2, exploreCollectionViewModel2, z142, a112, aVar, lVar, aVar32, (ho.l) L8, c3.k.d(-1878239711, true, new s(pVar, 1), qVar2)), qVar), qVar, 56);
        } else {
            qVar = qVar3;
            qVar.R();
        }
        ExploreCollectionViewModel exploreCollectionViewModel3 = exploreCollectionViewModel2;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(str, aVar, lVar, pVar, (MviViewModel) exploreCollectionViewModel3, i10, i11, 2);
        }
    }

    public static final sn.z ExploreCollectionScreen$lambda$10(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            float x52 = EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX5();
            boolean f10 = qVar.f(pVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new k(pVar, 1);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(x52, false, 0L, (ho.l) L, null, qVar, 48, 20);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreen$lambda$10$0$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreen$lambda$11(ExploreCollectionState exploreCollectionState, ExploreCollectionViewModel exploreCollectionViewModel, boolean z6, ua.b bVar, ho.a aVar, ho.l lVar, ho.a aVar2, ho.l lVar2, ho.p pVar, u2.m mVar, int i10) {
        boolean z10;
        if ((i10 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            boolean isLoadingDetails = exploreCollectionState.isLoadingDetails();
            i3.q qVar2 = i3.q.f13017a;
            if (isLoadingDetails && exploreCollectionState.getCollectionDetails() == null) {
                qVar.X(-169673697);
                i3.t h10 = l1.n.h(p2.d(qVar2, 1.0f), EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b);
                f4.f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(h10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                u2.r.J(h4.g.f11907f, d10, qVar);
                u2.r.J(h4.g.f11906e, l4, qVar);
                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                u2.r.F(h4.g.f11909h, qVar);
                u2.r.J(h4.g.f11905d, c5, qVar);
                LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
                qVar.p(true);
                qVar.p(false);
            } else if (exploreCollectionState.getErrorMessage() != null && exploreCollectionState.getCollectionDetails() == null) {
                qVar.X(-169268930);
                i3.t d11 = p2.d(qVar2, 1.0f);
                String errorMessage = exploreCollectionState.getErrorMessage();
                boolean h11 = qVar.h(exploreCollectionViewModel);
                Object L = qVar.L();
                if (h11 || L == u2.l.f33918a) {
                    L = new ExploreCollectionScreenKt$ExploreCollectionScreen$6$2$1(exploreCollectionViewModel);
                    qVar.h0(L);
                }
                ErrorScreenKt.m1837ErrorScreenuDo3WH8(d11, null, errorMessage, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), (ho.a) ((oo.g) L), qVar, 6, 2);
                qVar.p(false);
            } else if (exploreCollectionState.getCollectionDetails() != null) {
                qVar.X(-168929232);
                if (z6) {
                    qVar.X(-168916832);
                    ExploreSeriesScreenKt.ExploreSeriesScreenUI(exploreCollectionState.getCollectionDetails(), bVar, aVar, lVar, aVar2, lVar2, exploreCollectionState.getPlayingPreviewReadId(), pVar, qVar, 12582976, 0);
                    qVar.p(false);
                } else {
                    qVar.X(-168347300);
                    ExploreCollectionScreenUI(exploreCollectionState.getCollectionDetails(), bVar, aVar, lVar, aVar2, lVar2, exploreCollectionState.getPlayingPreviewReadId(), pVar, qVar, 12582976, 0);
                    qVar.p(false);
                }
                qVar.p(false);
            } else {
                qVar.X(-167773800);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreen$lambda$12(String str, ho.a aVar, ho.l lVar, ho.p pVar, ExploreCollectionViewModel exploreCollectionViewModel, int i10, int i11, u2.m mVar, int i12) {
        ExploreCollectionScreen(str, aVar, lVar, pVar, exploreCollectionViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreen$lambda$2$0(ho.a aVar, sn.z zVar) {
        zVar.getClass();
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final u2.h0 ExploreCollectionScreen$lambda$3$0(final ExploreCollectionViewModel exploreCollectionViewModel, u2.i0 i0Var) {
        i0Var.getClass();
        return new u2.h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionScreenKt$ExploreCollectionScreen$lambda$3$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                ExploreCollectionViewModel.this.stopPreview();
            }
        };
    }

    private static final String ExploreCollectionScreen$lambda$5(u2.z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z ExploreCollectionScreen$lambda$7$0(u2.z0 z0Var) {
        z0Var.setValue(null);
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreen$lambda$8$0(ExploreCollectionState exploreCollectionState, u2.z0 z0Var) {
        String str;
        ExploreCollectionDetails collectionDetails = exploreCollectionState.getCollectionDetails();
        if (collectionDetails != null) {
            str = collectionDetails.getShareUrl();
        } else {
            str = null;
        }
        z0Var.setValue(str);
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreen$lambda$9$0(ExploreCollectionViewModel exploreCollectionViewModel, ExploreRead exploreRead) {
        exploreRead.getClass();
        exploreCollectionViewModel.playPreview(exploreRead);
        return sn.z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x010e, code lost:
    
        if (r4 != false) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreCollectionScreenUI(ExploreCollectionDetails exploreCollectionDetails, ua.b bVar, ho.a aVar, ho.l lVar, ho.a aVar2, ho.l lVar2, String str, ho.p pVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        int i14;
        String str2;
        int i15;
        boolean z6;
        ho.a aVar3;
        u2.q qVar;
        String str3;
        ho.l lVar4;
        r1 r10;
        ho.l lVar5;
        String str4;
        boolean z10;
        ua.b bVar2;
        String str5;
        boolean z11;
        i3.q qVar2;
        int i16;
        int i17;
        GlassState glassState;
        ExploreCollectionDetails exploreCollectionDetails2;
        String str6;
        u2.q qVar3;
        boolean z12;
        ExploreRead exploreRead;
        boolean z13;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean h10;
        int i22;
        int i23;
        ho.a aVar4 = aVar;
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-2006681732);
        if ((i10 & 6) == 0) {
            if (qVar4.h(exploreCollectionDetails)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i12 = i23 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar4.f(bVar);
            } else {
                h10 = qVar4.h(bVar);
            }
            if (h10) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i12 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (qVar4.h(aVar4)) {
                i21 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i21 = 128;
            }
            i12 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (qVar4.h(lVar)) {
                i20 = 2048;
            } else {
                i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i20;
        }
        if ((i10 & 24576) == 0) {
            if (qVar4.h(aVar2)) {
                i19 = 16384;
            } else {
                i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i19;
        }
        int i24 = i11 & 32;
        if (i24 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            lVar3 = lVar2;
            if (qVar4.h(lVar3)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            i14 = i11 & 64;
            if (i14 == 0) {
                i12 |= 1572864;
            } else if ((1572864 & i10) == 0) {
                str2 = str;
                if (qVar4.f(str2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
                if ((12582912 & i10) == 0) {
                    if (qVar4.h(pVar)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((4793491 & i12) != 4793490) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar4.O(i12 & 1, z6)) {
                    if (i24 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar3;
                    }
                    if (i14 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (bVar.c() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        bVar2 = bVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 != null && (exploreRead = (ExploreRead) ((ta.p) bVar2.f34252c.getValue()).get(0)) != null && (str5 = ExploreKt.coverImageUrl(exploreRead, CoverImageSize.Large)) != null) {
                        if (str5.length() > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    str5 = null;
                    p3.x rememberAnimatedHeaderColor = PaletteUtilsKt.rememberAnimatedHeaderColor(str5, true, true, !(bVar.d().f32555a instanceof ta.r), qVar4, 432);
                    View view = (View) qVar4.j(AndroidCompositionLocals_androidKt.f2295f);
                    if (rememberAnimatedHeaderColor != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z11);
                    boolean h11 = qVar4.h(view) | qVar4.g(z11);
                    Object L = qVar4.L();
                    u2.e eVar = u2.l.f33918a;
                    if (h11 || L == eVar) {
                        L = new c0(view, 0, z11);
                        qVar4.h0(L);
                    }
                    u2.r.c(valueOf, (ho.l) L, qVar4);
                    Object[] objArr = new Object[0];
                    Object L2 = qVar4.L();
                    if (L2 == eVar) {
                        L2 = new d(27);
                        qVar4.h0(L2);
                    }
                    u2.x0 x0Var = (u2.x0) f3.m.e(objArr, (ho.a) L2, qVar4, 48);
                    float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(ExploreCollectionScreenUI$lambda$4(x0Var), (u2.m) qVar4, 0);
                    GlassState rememberGlassState = GlassModifiersKt.rememberGlassState(qVar4, 0);
                    i3.q qVar5 = i3.q.f13017a;
                    i3.t d10 = p2.d(qVar5, 1.0f);
                    EchoTheme echoTheme = EchoTheme.INSTANCE;
                    int i25 = EchoTheme.$stable;
                    int i26 = i12;
                    i3.t h12 = l1.n.h(d10, echoTheme.getColors(qVar4, i25).getBackground().getPrimary(qVar4, EchoThemeColors.Background.$stable), p3.h0.f26395b);
                    i3.l lVar6 = i3.d.f12997a;
                    f4.f1 d11 = r1.p.d(lVar6, false);
                    int hashCode = Long.hashCode(qVar4.T);
                    c3.o l4 = qVar4.l();
                    i3.t c5 = i3.a.c(h12, qVar4);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar4.b0();
                    if (qVar4.S) {
                        qVar4.k(fVar);
                    } else {
                        qVar4.k0();
                    }
                    h4.e eVar2 = h4.g.f11907f;
                    u2.r.J(eVar2, d11, qVar4);
                    h4.e eVar3 = h4.g.f11906e;
                    u2.r.J(eVar3, l4, qVar4);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    h4.e eVar4 = h4.g.f11908g;
                    u2.r.y(qVar4, valueOf2, eVar4);
                    h4.d dVar = h4.g.f11909h;
                    u2.r.F(dVar, qVar4);
                    h4.e eVar5 = h4.g.f11905d;
                    u2.r.J(eVar5, c5, qVar4);
                    i3.t glassSource = GlassModifiersKt.glassSource(p2.d(qVar5, 1.0f), rememberGlassState);
                    f4.f1 d12 = r1.p.d(lVar6, false);
                    int hashCode2 = Long.hashCode(qVar4.T);
                    c3.o l7 = qVar4.l();
                    i3.t c10 = i3.a.c(glassSource, qVar4);
                    qVar4.b0();
                    if (qVar4.S) {
                        qVar4.k(fVar);
                    } else {
                        qVar4.k0();
                    }
                    u2.r.J(eVar2, d12, qVar4);
                    u2.r.J(eVar3, l7, qVar4);
                    defpackage.f.u(hashCode2, qVar4, eVar4, qVar4, dVar);
                    u2.r.J(eVar5, c10, qVar4);
                    if (rememberAnimatedHeaderColor == null) {
                        qVar4.X(-1064854749);
                        i3.t d13 = p2.d(qVar5, 1.0f);
                        f4.f1 d14 = r1.p.d(i3.d.f13001e, false);
                        int hashCode3 = Long.hashCode(qVar4.T);
                        c3.o l10 = qVar4.l();
                        i3.t c11 = i3.a.c(d13, qVar4);
                        qVar4.b0();
                        if (qVar4.S) {
                            qVar4.k(fVar);
                        } else {
                            qVar4.k0();
                        }
                        u2.r.J(eVar2, d14, qVar4);
                        u2.r.J(eVar3, l10, qVar4);
                        defpackage.f.u(hashCode3, qVar4, eVar4, qVar4, dVar);
                        u2.r.J(eVar5, c11, qVar4);
                        z12 = true;
                        LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar4, 0, 15);
                        qVar3 = qVar4;
                        qVar3.p(true);
                        qVar3.p(false);
                        qVar2 = qVar5;
                        i16 = 0;
                        lVar4 = lVar5;
                        str6 = str4;
                        i17 = i25;
                        glassState = rememberGlassState;
                        exploreCollectionDetails2 = exploreCollectionDetails;
                    } else {
                        qVar4.X(-1064607338);
                        long j4 = rememberAnimatedHeaderColor.f26440a;
                        i3.t y10 = r1.d.y(qVar5);
                        int i27 = i26 << 3;
                        qVar2 = qVar5;
                        i16 = 0;
                        lVar4 = lVar5;
                        String str7 = str4;
                        i17 = i25;
                        glassState = rememberGlassState;
                        exploreCollectionDetails2 = exploreCollectionDetails;
                        m1211CollectionDetailsScaffoldlQd7feU(exploreCollectionDetails2, j4, bVar, y10, lVar, lVar4, str7, pVar, rememberPxToDp, qVar4, (i26 & 14) | 512 | (i27 & 896) | (i27 & 57344) | (i26 & 458752) | (i26 & 3670016) | (i26 & 29360128), 0);
                        str6 = str7;
                        qVar3 = qVar4;
                        qVar3.p(false);
                        z12 = true;
                    }
                    qVar3.p(z12);
                    i3.t glassButtonEffect = GlassModifiersKt.glassButtonEffect(qVar2, glassState, qVar3, (GlassState.$stable << 3) | 6);
                    boolean f10 = qVar3.f(x0Var);
                    Object L3 = qVar3.L();
                    if (f10 || L3 == eVar) {
                        L3 = new m(x0Var, 1);
                        qVar3.h0(L3);
                    }
                    i3.t q = f4.i0.q(qVar2, (ho.l) L3);
                    int i28 = i17;
                    d2 d2Var = new d2(echoTheme.getSpacings(qVar3, i28).getX5(), echoTheme.getSpacings(qVar3, i28).getX6(), echoTheme.getSpacings(qVar3, i28).getX5(), i16);
                    aVar4 = aVar;
                    aVar3 = aVar2;
                    HeaderKt.m1896HeaderShfnhV8(q, c3.k.d(-1590061691, true, new f(aVar4, glassButtonEffect, 2), qVar3), echoTheme.getSpacings(qVar3, i28).getX1(), c3.k.d(-1997085177, true, new d0(exploreCollectionDetails2, aVar3, glassButtonEffect, 0), qVar3), echoTheme.getSpacings(qVar3, i28).getX0(), ComposableSingletons$ExploreCollectionScreenKt.INSTANCE.getLambda$1162160120$app_productionRelease(), d2Var, null, null, 0L, qVar3, 199728, 896);
                    qVar3.p(true);
                    qVar = qVar3;
                    str3 = str6;
                } else {
                    aVar3 = aVar2;
                    qVar4.R();
                    qVar = qVar4;
                    str3 = str2;
                    lVar4 = lVar3;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new e0(exploreCollectionDetails, bVar, aVar4, lVar, aVar3, lVar4, str3, pVar, i10, i11, 0);
                    return;
                }
                return;
            }
            str2 = str;
            if ((12582912 & i10) == 0) {
            }
            if ((4793491 & i12) != 4793490) {
            }
            if (qVar4.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar3 = lVar2;
        i14 = i11 & 64;
        if (i14 == 0) {
        }
        str2 = str;
        if ((12582912 & i10) == 0) {
        }
        if ((4793491 & i12) != 4793490) {
        }
        if (qVar4.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final u2.h0 ExploreCollectionScreenUI$lambda$2$0(View view, boolean z6, u2.i0 i0Var) {
        Activity activity;
        Window window;
        i0Var.getClass();
        Context context = view.getContext();
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null && (window = activity.getWindow()) != null) {
            final m2 m2Var = new m2(window, view);
            final boolean E = m2Var.f20144a.E();
            m2Var.a(!z6);
            return new u2.h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionScreenKt$ExploreCollectionScreenUI$lambda$2$0$$inlined$onDispose$2
                @Override // u2.h0
                public void dispose() {
                    m2.this.a(E);
                }
            };
        }
        return new u2.h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.ExploreCollectionScreenKt$ExploreCollectionScreenUI$lambda$2$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
            }
        };
    }

    public static final u2.x0 ExploreCollectionScreenUI$lambda$3$0() {
        return new u2.f1(250);
    }

    private static final int ExploreCollectionScreenUI$lambda$4(u2.x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void ExploreCollectionScreenUI$lambda$5(u2.x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$6$1$0(u2.x0 x0Var, h5.l lVar) {
        ExploreCollectionScreenUI$lambda$5(x0Var, (int) (lVar.f12092a & 4294967295L));
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$6$2(ho.a aVar, i3.t tVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        l2Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(l2Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            EchoButtonVariant echoButtonVariant = EchoButtonVariant.GhostWhite;
            boolean f10 = qVar.f(aVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new q(1, aVar);
                qVar.h0(L);
            }
            EchoBackButtonKt.EchoBackButton((ho.a) L, tVar, echoButtonVariant, null, qVar, 384, 8);
            r1.d.g(l2Var.b(i3.q.f13017a, 1.0f, true), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$6$2$0$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$6$3(ExploreCollectionDetails exploreCollectionDetails, ho.a aVar, i3.t tVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (exploreCollectionDetails.getShareUrl() != null) {
                qVar.X(-1277431247);
                EchoIconButtonKt.EchoIconButton(R.drawable.share_android, aVar, tVar, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.share_read_share), EchoButtonVariant.GhostWhite, EchoButtonSize.Medium, false, false, false, qVar, 221184, 448);
                qVar.p(false);
            } else {
                qVar.X(-1277004005);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ExploreCollectionScreenUI$lambda$7(ExploreCollectionDetails exploreCollectionDetails, ua.b bVar, ho.a aVar, ho.l lVar, ho.a aVar2, ho.l lVar2, String str, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        ExploreCollectionScreenUI(exploreCollectionDetails, bVar, aVar, lVar, aVar2, lVar2, str, pVar, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreCollectionScreen_Content(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-708296622);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$ExploreCollectionScreenKt.INSTANCE.m1191getLambda$778844036$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 14);
        }
    }

    public static final sn.z Preview_ExploreCollectionScreen_Content$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreCollectionScreen_Content(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreCollectionScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-557021405);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$ExploreCollectionScreenKt.INSTANCE.getLambda$1833963981$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 12);
        }
    }

    public static final sn.z Preview_ExploreCollectionScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreCollectionScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ExploreCollectionScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(897730991);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$ExploreCollectionScreenKt.INSTANCE.getLambda$827183577$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.anonymous.signin.mfa.d(i10, 13);
        }
    }

    public static final sn.z Preview_ExploreCollectionScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ExploreCollectionScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
