package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ho.l;
import i3.t;
import io.elevenlabs.domain.model.home.HomePageV4;
import io.elevenlabs.readerapp.ui.components.explore.ExploreHighlightCarouselKt;
import io.elevenlabs.readerapp.ui.components.u0;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ai\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/domain/model/home/HomePageV4$Section$HighlightedCarousel;", "section", "Lkotlin/Function1;", "", "Lsn/z;", "onReadClick", "Lkotlin/Function0;", "onSeeAllClick", "Li3/t;", "modifier", "Lio/elevenlabs/domain/model/ExploreRead;", "onPreviewClick", "playingPreviewReadId", "HomeHighlightedCarouselSectionV4", "(Lio/elevenlabs/domain/model/home/HomePageV4$Section$HighlightedCarousel;Lho/l;Lho/a;Li3/t;Lho/l;Ljava/lang/String;Lu2/m;II)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class HomeHighlightedCarouselSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeHighlightedCarouselSectionV4(HomePageV4.Section.HighlightedCarousel highlightedCarousel, l lVar, ho.a aVar, t tVar, l lVar2, String str, m mVar, int i10, int i11) {
        HomePageV4.Section.HighlightedCarousel highlightedCarousel2;
        int i12;
        t tVar2;
        int i13;
        int i14;
        l lVar3;
        int i15;
        int i16;
        String str2;
        int i17;
        boolean z6;
        q qVar;
        l lVar4;
        String str3;
        r1 r10;
        t tVar3;
        l lVar5;
        String str4;
        int i18;
        int i19;
        int i20;
        highlightedCarousel.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(468623692);
        if ((i10 & 6) == 0) {
            highlightedCarousel2 = highlightedCarousel;
            if (qVar2.h(highlightedCarousel2)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            highlightedCarousel2 = highlightedCarousel;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar2.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                lVar3 = lVar2;
                if (qVar2.h(lVar3)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    str2 = str;
                    if (qVar2.f(str2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    if ((74899 & i12) == 74898) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar2.O(i12 & 1, z6)) {
                        if (i21 != 0) {
                            tVar3 = i3.q.f13017a;
                        } else {
                            tVar3 = tVar2;
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
                        qVar = qVar2;
                        ExploreHighlightCarouselKt.ExploreHighlightCarousel(highlightedCarousel2.getTitle(), highlightedCarousel2.getSubtitle(), highlightedCarousel2.getReads(), lVar, aVar, tVar3, lVar5, str4, qVar, (i12 << 6) & 33553408, 0);
                        tVar2 = tVar3;
                        lVar4 = lVar5;
                        str3 = str4;
                    } else {
                        qVar = qVar2;
                        qVar.R();
                        lVar4 = lVar3;
                        str3 = str2;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new u0(highlightedCarousel2, lVar, aVar, tVar2, lVar4, str3, i10, i11);
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((74899 & i12) == 74898) {
                }
                if (!qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar3 = lVar2;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            str2 = str;
            if ((74899 & i12) == 74898) {
            }
            if (!qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        lVar3 = lVar2;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        str2 = str;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z HomeHighlightedCarouselSectionV4$lambda$0(HomePageV4.Section.HighlightedCarousel highlightedCarousel, l lVar, ho.a aVar, t tVar, l lVar2, String str, int i10, int i11, m mVar, int i12) {
        HomeHighlightedCarouselSectionV4(highlightedCarousel, lVar, aVar, tVar, lVar2, str, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
