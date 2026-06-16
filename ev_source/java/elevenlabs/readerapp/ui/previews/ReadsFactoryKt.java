package io.elevenlabs.readerapp.ui.previews;

import ae.l;
import android.gov.nist.core.Separators;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import io.elevenlabs.domain.model.BasicReadMeta;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.Rating;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadSource;
import io.elevenlabs.domain.model.VoiceSelectionConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import no.e;
import no.g;
import tn.o;
import tn.p;
import tn.t;
import tn.y;
import wq.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\t\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001¨\u0006\u0010"}, d2 = {"stubReadMetaList", "", "Lio/elevenlabs/domain/model/ReadMeta;", "count", "", "coverAspectRatio", "", "(ILjava/lang/Double;)Ljava/util/List;", "stubReadMeta", "(Ljava/lang/Double;)Lio/elevenlabs/domain/model/ReadMeta;", "stubBasicReadMetaList", "Lio/elevenlabs/domain/model/BasicReadMeta;", "stubChaptersList", "Lio/elevenlabs/domain/model/Chapter;", "stubReadElements", "", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ReadsFactoryKt {
    public static final List<BasicReadMeta> stubBasicReadMetaList(int i10) {
        List<ReadMeta> stubReadMetaList$default = stubReadMetaList$default(i10, null, 2, null);
        ArrayList arrayList = new ArrayList(p.a0(stubReadMetaList$default, 10));
        for (ReadMeta readMeta : stubReadMetaList$default) {
            arrayList.add(new BasicReadMeta(readMeta.getReadId(), readMeta.getTitle(), readMeta.getArticleImageUrl()));
        }
        return arrayList;
    }

    public static /* synthetic */ List stubBasicReadMetaList$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return stubBasicReadMetaList(i10);
    }

    public static final List<Chapter> stubChaptersList(int i10) {
        e eVar = new e(0, i10, 1);
        ArrayList arrayList = new ArrayList(p.a0(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            int nextInt = ((y) it).nextInt();
            arrayList.add(new Chapter(nextInt, 1000 * nextInt, "Chapter", 1000L, true, 300L, null, null));
        }
        return arrayList;
    }

    public static /* synthetic */ List stubChaptersList$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 10;
        }
        return stubChaptersList(i10);
    }

    public static final List<String> stubReadElements() {
        return n.z0("\n    |<h2>Chapter 1</h2>\n    |<p>Text</p>\n    |<h2>Chapter 2</h2>\n    |<p>Text</p>\n    |<h2>Chapter 3</h2>\n    |<p>Text</p>\n    |<h2>Chapter 4</h2>\n    |<p>Text</p>\n    |<h2>Chapter 5</h2>\n    |<p>Text</p>\n    |<h2>Chapter 6</h2>\n    |<p>Text</p>\n    |<h2>Chapter 7</h2>\n    |<p>Text</p>\n    |<h2>Chapter 8</h2>\n    |<p>Text</p>\n    |", new String[]{Separators.RETURN}, 6);
    }

    public static final ReadMeta stubReadMeta(Double d10) {
        return (ReadMeta) o.w0(stubReadMetaList(1, d10));
    }

    public static /* synthetic */ ReadMeta stubReadMeta$default(Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = null;
        }
        return stubReadMeta(d10);
    }

    public static final List<ReadMeta> stubReadMetaList(int i10, Double d10) {
        g f02 = l.f0(0, i10);
        ArrayList arrayList = new ArrayList(p.a0(f02, 10));
        Iterator it = f02.iterator();
        while (it.hasNext()) {
            int nextInt = ((y) it).nextInt();
            String e10 = f.e(nextInt, "Author ");
            Date date = new Date(1714026044L);
            Date date2 = new Date(1714026044L);
            Date date3 = new Date(1714026044L);
            String e11 = f.e(nextInt, "description ");
            String e12 = f.e(nextInt, "readId-");
            ReadSource readSource = ReadSource.Text;
            String e13 = f.e(nextInt, "title ");
            Rating rating = new Rating(4.5f, 99L);
            VoiceSelectionConfig voiceSelectionConfig = VoiceSelectionConfig.AllowAll;
            t tVar = t.f33547a;
            arrayList.add(new ReadMeta(null, e10, tVar, 20L, date, date2, date3, e11, 10L, e12, readSource, e13, "subtitle", "https://example.com", 2000L, "text/html", false, false, FirebaseAnalytics.Param.ORIGIN, "text/html", tVar, false, true, rating, 3L, null, null, null, false, false, null, null, "en", null, true, null, false, null, null, null, voiceSelectionConfig, null, null, false, false, null, false, null, null, null, null, false, null, null, d10, ExploreFactoryKt.SAMPLE_BLUR_PLACEHOLDER, 0, 4069408, null));
        }
        return arrayList;
    }

    public static /* synthetic */ List stubReadMetaList$default(int i10, Double d10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        if ((i11 & 2) != 0) {
            d10 = null;
        }
        return stubReadMetaList(i10, d10);
    }
}
