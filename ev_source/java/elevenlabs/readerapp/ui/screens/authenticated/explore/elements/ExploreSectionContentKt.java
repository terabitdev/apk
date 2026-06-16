package io.elevenlabs.readerapp.ui.screens.authenticated.explore.elements;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ho.l;
import io.elevenlabs.domain.model.ExploreDeeplinkPosition;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.ReadsExplorePage;
import io.elevenlabs.ocr.o;
import io.elevenlabs.readerapp.ui.components.explore.ExploreCardCarouselCollectionKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreHeroCarouselKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreHighlightCarouselKt;
import io.elevenlabs.readerapp.ui.components.explore.ExploreSectionHeaderKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001am\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/domain/model/ReadsExplorePage$Section;", "section", "Lkotlin/Function1;", "", "Lsn/z;", "onNavigateToDeeplink", "onNavigateToRead", "Lio/elevenlabs/domain/model/ExploreRead;", "onPreviewClick", "playingPreviewReadId", "", "showLargeGridPreview", "ExploreSectionContent", "(Lio/elevenlabs/domain/model/ReadsExplorePage$Section;Lho/l;Lho/l;Lho/l;Ljava/lang/String;ZLu2/m;II)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ExploreSectionContentKt {
    /* JADX WARN: Removed duplicated region for block: B:143:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExploreSectionContent(ReadsExplorePage.Section section, l lVar, l lVar2, l lVar3, String str, boolean z6, m mVar, int i10, int i11) {
        int i12;
        l lVar4;
        int i13;
        int i14;
        String str2;
        int i15;
        int i16;
        boolean z10;
        int i17;
        boolean z11;
        l lVar5;
        l lVar6;
        String str3;
        boolean z12;
        q qVar;
        r1 r10;
        int i18;
        l lVar7;
        boolean z13;
        l lVar8;
        String str4;
        boolean z14;
        boolean z15;
        boolean z16;
        ho.a aVar;
        l lVar9;
        boolean z17;
        q qVar2;
        q qVar3;
        boolean z18;
        int i19;
        int i20;
        int i21;
        section.getClass();
        lVar.getClass();
        lVar2.getClass();
        q qVar4 = (q) mVar;
        qVar4.Z(687898774);
        if ((i10 & 6) == 0) {
            if (qVar4.h(section)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar4.h(lVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        if ((i10 & 384) == 0) {
            if (qVar4.h(lVar2)) {
                i19 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        int i22 = i11 & 8;
        if (i22 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            lVar4 = lVar3;
            if (qVar4.h(lVar4)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                str2 = str;
                if (qVar4.f(str2)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    z10 = z6;
                    if (qVar4.g(z10)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    if ((74899 & i12) == 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!qVar4.O(i12 & 1, z11)) {
                        ho.a aVar2 = null;
                        ho.a aVar3 = null;
                        ho.a aVar4 = null;
                        String str5 = null;
                        if (i22 != 0) {
                            i18 = i14;
                            lVar7 = null;
                        } else {
                            i18 = i14;
                            lVar7 = lVar4;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if (i16 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        boolean z19 = section instanceof ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel;
                        Object obj = u2.l.f33918a;
                        if (z19) {
                            qVar4.X(1903763210);
                            ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel getReadsExploreHighlightedCarousel = (ReadsExplorePage.Section.GetReadsExploreHighlightedCarousel) section;
                            int i23 = i12;
                            String title = getReadsExploreHighlightedCarousel.getTitle();
                            String subtitle = getReadsExploreHighlightedCarousel.getSubtitle();
                            List<ExploreRead> reads = getReadsExploreHighlightedCarousel.getReads();
                            String deeplink = getReadsExploreHighlightedCarousel.getDeeplink();
                            if (deeplink == null) {
                                qVar4.X(1904009845);
                            } else {
                                qVar4.X(1904009846);
                                if ((i23 & 112) == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                boolean f10 = z18 | qVar4.f(deeplink);
                                Object L = qVar4.L();
                                Object obj2 = L;
                                if (f10 || L == obj) {
                                    Object aVar5 = new fm.a(2, lVar, deeplink);
                                    qVar4.h0(aVar5);
                                    obj2 = aVar5;
                                }
                                aVar3 = (ho.a) obj2;
                            }
                            qVar4.p(false);
                            int i24 = (i23 << 3) & 7168;
                            int i25 = i23 << 9;
                            ExploreHighlightCarouselKt.ExploreHighlightCarousel(title, subtitle, reads, lVar2, aVar3, null, lVar7, str2, qVar4, i24 | (3670016 & i25) | (i25 & 29360128), 32);
                            lVar8 = lVar7;
                            str4 = str2;
                            q qVar5 = qVar4;
                            qVar5.p(false);
                            qVar3 = qVar5;
                        } else {
                            int i26 = i12;
                            lVar8 = lVar7;
                            str4 = str2;
                            if (section instanceof ReadsExplorePage.Section.GetReadsExploreSmallGrid) {
                                qVar4.X(1904263085);
                                ReadsExplorePage.Section.GetReadsExploreSmallGrid getReadsExploreSmallGrid = (ReadsExplorePage.Section.GetReadsExploreSmallGrid) section;
                                String title2 = getReadsExploreSmallGrid.getTitle();
                                String subtitle2 = getReadsExploreSmallGrid.getSubtitle();
                                List<ExploreRead> reads2 = getReadsExploreSmallGrid.getReads();
                                Integer rows = getReadsExploreSmallGrid.getRows();
                                ExploreDeeplinkPosition deeplinkPosition = getReadsExploreSmallGrid.getDeeplinkPosition();
                                String deeplink2 = getReadsExploreSmallGrid.getDeeplink();
                                if (deeplink2 == null) {
                                    qVar4.X(1904596117);
                                } else {
                                    qVar4.X(1904596118);
                                    if ((i26 & 112) == 32) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    boolean f11 = z17 | qVar4.f(deeplink2);
                                    Object L2 = qVar4.L();
                                    Object obj3 = L2;
                                    if (f11 || L2 == obj) {
                                        Object aVar6 = new fm.a(3, lVar, deeplink2);
                                        qVar4.h0(aVar6);
                                        obj3 = aVar6;
                                    }
                                    aVar4 = (ho.a) obj3;
                                }
                                qVar4.p(false);
                                ExploreSmallGridCollectionKt.ExploreSmallGridCollection(title2, subtitle2, reads2, lVar2, aVar4, null, rows, deeplinkPosition, qVar4, (i26 << 3) & 7168, 32);
                                q qVar6 = qVar4;
                                qVar6.p(false);
                                qVar3 = qVar6;
                            } else if (section instanceof ReadsExplorePage.Section.GetReadsExploreLargeGrid) {
                                qVar4.X(1904743027);
                                ReadsExplorePage.Section.GetReadsExploreLargeGrid getReadsExploreLargeGrid = (ReadsExplorePage.Section.GetReadsExploreLargeGrid) section;
                                String title3 = getReadsExploreLargeGrid.getTitle();
                                String subtitle3 = getReadsExploreLargeGrid.getSubtitle();
                                List<ExploreRead> reads3 = getReadsExploreLargeGrid.getReads();
                                Integer rows2 = getReadsExploreLargeGrid.getRows();
                                String deeplink3 = getReadsExploreLargeGrid.getDeeplink();
                                if (deeplink3 == null) {
                                    qVar4.X(1905011765);
                                    qVar4.p(false);
                                    aVar = null;
                                } else {
                                    qVar4.X(1905011766);
                                    if ((i26 & 112) == 32) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    boolean f12 = z16 | qVar4.f(deeplink3);
                                    Object L3 = qVar4.L();
                                    Object obj4 = L3;
                                    if (f12 || L3 == obj) {
                                        Object aVar7 = new fm.a(4, lVar, deeplink3);
                                        qVar4.h0(aVar7);
                                        obj4 = aVar7;
                                    }
                                    qVar4.p(false);
                                    aVar = (ho.a) obj4;
                                }
                                if (z13) {
                                    lVar9 = lVar8;
                                } else {
                                    lVar9 = null;
                                }
                                if (z13) {
                                    str5 = str4;
                                }
                                ExploreLargeGridCollectionKt.ExploreLargeGridCollection(title3, subtitle3, reads3, lVar2, aVar, null, rows2, lVar9, str5, qVar4, (i26 << 3) & 7168, 32);
                                q qVar7 = qVar4;
                                qVar7.p(false);
                                qVar3 = qVar7;
                            } else if (section instanceof ReadsExplorePage.Section.GetReadsExploreCardCollection) {
                                qVar4.X(1905325300);
                                ReadsExplorePage.Section.GetReadsExploreCardCollection getReadsExploreCardCollection = (ReadsExplorePage.Section.GetReadsExploreCardCollection) section;
                                String title4 = getReadsExploreCardCollection.getTitle();
                                String subtitle4 = getReadsExploreCardCollection.getSubtitle();
                                List<ExploreRead> reads4 = getReadsExploreCardCollection.getReads();
                                String deeplink4 = getReadsExploreCardCollection.getDeeplink();
                                if (deeplink4 == null) {
                                    qVar4.X(1905580181);
                                } else {
                                    qVar4.X(1905580182);
                                    if ((i26 & 112) == 32) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    boolean f13 = z15 | qVar4.f(deeplink4);
                                    Object L4 = qVar4.L();
                                    Object obj5 = L4;
                                    if (f13 || L4 == obj) {
                                        Object aVar8 = new fm.a(5, lVar, deeplink4);
                                        qVar4.h0(aVar8);
                                        obj5 = aVar8;
                                    }
                                    aVar2 = (ho.a) obj5;
                                }
                                qVar4.p(false);
                                ExploreCardCarouselCollectionKt.ExploreCardCarouselCollection(title4, subtitle4, reads4, lVar2, null, aVar2, qVar4, (i26 << 3) & 7168, 16);
                                q qVar8 = qVar4;
                                qVar8.p(false);
                                qVar3 = qVar8;
                            } else {
                                if (section instanceof ReadsExplorePage.Section.GetReadsExploreHeroCarousel) {
                                    qVar4.X(1905707933);
                                    ReadsExplorePage.Section.GetReadsExploreHeroCarousel getReadsExploreHeroCarousel = (ReadsExplorePage.Section.GetReadsExploreHeroCarousel) section;
                                    ExploreHeroCarouselKt.ExploreHeroCarousel(getReadsExploreHeroCarousel.getTitle(), getReadsExploreHeroCarousel.getSubtitle(), getReadsExploreHeroCarousel.getItems(), lVar, null, null, qVar4, ((i26 << 6) & 7168) | 24576, 32);
                                    lVar5 = lVar;
                                    qVar4.p(false);
                                    qVar2 = qVar4;
                                } else {
                                    lVar5 = lVar;
                                    if (section instanceof ReadsExplorePage.Section.GetReadsExploreVoiceCollection) {
                                        qVar4.X(1906024319);
                                        ReadsExplorePage.Section.GetReadsExploreVoiceCollection getReadsExploreVoiceCollection = (ReadsExplorePage.Section.GetReadsExploreVoiceCollection) section;
                                        String title5 = getReadsExploreVoiceCollection.getTitle();
                                        String subtitle5 = getReadsExploreVoiceCollection.getSubtitle();
                                        List<ReadsExplorePage.Section.GetReadsExploreVoiceCollection.VoiceItem> items = getReadsExploreVoiceCollection.getItems();
                                        if ((i26 & 112) == 32) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        Object L5 = qVar4.L();
                                        Object obj6 = L5;
                                        if (z14 || L5 == obj) {
                                            Object mVar2 = new g3.m(lVar5, 5);
                                            qVar4.h0(mVar2);
                                            obj6 = mVar2;
                                        }
                                        ExploreVoiceCollectionKt.ExploreVoiceCollection(title5, subtitle5, items, (l) obj6, null, null, qVar4, 24576, 32);
                                        qVar4.p(false);
                                        qVar2 = qVar4;
                                    } else if (section instanceof ReadsExplorePage.Section.GetReadsExploreTitleSubtitle) {
                                        qVar4.X(1906362653);
                                        ReadsExplorePage.Section.GetReadsExploreTitleSubtitle getReadsExploreTitleSubtitle = (ReadsExplorePage.Section.GetReadsExploreTitleSubtitle) section;
                                        ExploreSectionHeaderKt.ExploreSectionHeader(getReadsExploreTitleSubtitle.getTitle(), null, getReadsExploreTitleSubtitle.getSubtitle(), null, qVar4, 0, 10);
                                        q qVar9 = qVar4;
                                        qVar9.p(false);
                                        qVar2 = qVar9;
                                    } else {
                                        throw com.google.android.gms.internal.play_billing.b.h(-354229997, qVar4, false);
                                    }
                                }
                                z12 = z13;
                                lVar6 = lVar8;
                                str3 = str4;
                                qVar = qVar2;
                            }
                        }
                        lVar5 = lVar;
                        qVar2 = qVar3;
                        z12 = z13;
                        lVar6 = lVar8;
                        str3 = str4;
                        qVar = qVar2;
                    } else {
                        lVar5 = lVar;
                        qVar4.R();
                        lVar6 = lVar4;
                        str3 = str2;
                        z12 = z10;
                        qVar = qVar4;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new o(section, lVar5, lVar2, lVar6, str3, z12, i10, i11);
                        return;
                    }
                    return;
                }
                z10 = z6;
                if ((74899 & i12) == 74898) {
                }
                if (!qVar4.O(i12 & 1, z11)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            str2 = str;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            z10 = z6;
            if ((74899 & i12) == 74898) {
            }
            if (!qVar4.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        lVar4 = lVar3;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        str2 = str;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        z10 = z6;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar4.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ExploreSectionContent$lambda$0$0$0(l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z ExploreSectionContent$lambda$1$0$0(l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z ExploreSectionContent$lambda$2$0$0(l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z ExploreSectionContent$lambda$3$0$0(l lVar, String str) {
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z ExploreSectionContent$lambda$4$0(l lVar, String str) {
        str.getClass();
        lVar.invoke(str);
        return z.f31622a;
    }

    public static final z ExploreSectionContent$lambda$5(ReadsExplorePage.Section section, l lVar, l lVar2, l lVar3, String str, boolean z6, int i10, int i11, m mVar, int i12) {
        ExploreSectionContent(section, lVar, lVar2, lVar3, str, z6, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
