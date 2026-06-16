package io.elevenlabs.readerapp.usecase;

import ae.l;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import ig.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import org.jsoup.nodes.g;
import rd.s0;
import sn.k;
import tn.n;
import tn.o;
import wq.u;
import xs.e;
import xs.v;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 32\u00020\u0001:\u000234B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJI\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010\"\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010#J'\u0010&\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J'\u0010)\u001a\u0004\u0018\u00010\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010'J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010-J,\u0010.\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b.\u0010/J:\u0010.\u001a\u0004\u0018\u00010\u000b2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b.\u00102¨\u00065"}, d2 = {"Lio/elevenlabs/readerapp/usecase/GetBookmarkWindowUseCase;", "", "<init>", "()V", "", "Lio/elevenlabs/readerapp/usecase/GetBookmarkWindowUseCase$SpanInfo;", "spans", "", "focusOffset", "", "maxLen", "Lio/elevenlabs/readerapp/usecase/BookmarkWindow;", "windowOver", "(Ljava/util/List;JI)Lio/elevenlabs/readerapp/usecase/BookmarkWindow;", "startIdx", "endIdx", "focusIdx", "Lsn/k;", "trimAroundFocus", "(Ljava/util/List;IIII)Lsn/k;", "expandToAdjacentSentences", "(Ljava/util/List;III)Lsn/k;", "", "html", "parseSpans", "(Ljava/lang/String;)Ljava/util/List;", "charSpan", "(Ljava/util/List;)J", "joinText", "(Ljava/util/List;)Ljava/lang/String;", "offset", "focusSpanIndex", "(Ljava/util/List;J)I", "fromIdx", "sentenceStartIndex", "(Ljava/util/List;I)I", "sentenceEndIndex", "afterIdx", "nextSentenceEnd", "(Ljava/util/List;I)Ljava/lang/Integer;", "beforeIdx", "previousSentenceStart", "span", "", "endsSentence", "(Lio/elevenlabs/readerapp/usecase/GetBookmarkWindowUseCase$SpanInfo;)Z", "invoke", "(Ljava/lang/String;JI)Lio/elevenlabs/readerapp/usecase/BookmarkWindow;", "elements", "focusElementIndex", "(Ljava/util/List;IJI)Lio/elevenlabs/readerapp/usecase/BookmarkWindow;", "Companion", "SpanInfo", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class GetBookmarkWindowUseCase {
    public static final int $stable = 0;
    private static final int EXPAND_BUDGET_MULTIPLIER = 3;
    public static final int MAX_BOOKMARK_CHARS = 400;
    private static final Set<Character> SENTENCE_END_PUNCTUATION = n.f1(new Character[]{'.', '!', '?', 8230});
    private static final Set<Character> TRAILING_CLOSERS = n.f1(new Character[]{'\"', '\'', 8221, 8217, ')', ']', '}'});

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/readerapp/usecase/GetBookmarkWindowUseCase$SpanInfo;", "", "start", "", "endExclusive", ParameterNames.TEXT, "", "<init>", "(JJLjava/lang/String;)V", "getStart", "()J", "getEndExclusive", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class SpanInfo {
        private final long endExclusive;
        private final long start;
        private final String text;

        public SpanInfo(long j4, long j10, String str) {
            str.getClass();
            this.start = j4;
            this.endExclusive = j10;
            this.text = str;
        }

        public static /* synthetic */ SpanInfo copy$default(SpanInfo spanInfo, long j4, long j10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = spanInfo.start;
            }
            long j11 = j4;
            if ((i10 & 2) != 0) {
                j10 = spanInfo.endExclusive;
            }
            long j12 = j10;
            if ((i10 & 4) != 0) {
                str = spanInfo.text;
            }
            return spanInfo.copy(j11, j12, str);
        }

        /* renamed from: component1, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component2, reason: from getter */
        public final long getEndExclusive() {
            return this.endExclusive;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final SpanInfo copy(long start, long endExclusive, String text) {
            text.getClass();
            return new SpanInfo(start, endExclusive, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpanInfo)) {
                return false;
            }
            SpanInfo spanInfo = (SpanInfo) other;
            if (this.start == spanInfo.start && this.endExclusive == spanInfo.endExclusive && m.c(this.text, spanInfo.text)) {
                return true;
            }
            return false;
        }

        public final long getEndExclusive() {
            return this.endExclusive;
        }

        public final long getStart() {
            return this.start;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + com.google.android.gms.internal.play_billing.b.g(this.endExclusive, Long.hashCode(this.start) * 31, 31);
        }

        public String toString() {
            long j4 = this.start;
            long j10 = this.endExclusive;
            String str = this.text;
            StringBuilder q = com.google.android.gms.internal.play_billing.b.q("SpanInfo(start=", j4, ", endExclusive=");
            q.append(j10);
            q.append(", text=");
            q.append(str);
            q.append(Separators.RPAREN);
            return q.toString();
        }
    }

    private final long charSpan(List<SpanInfo> spans) {
        if (spans.isEmpty()) {
            return 0L;
        }
        return ((SpanInfo) o.G0(spans)).getEndExclusive() - ((SpanInfo) o.w0(spans)).getStart();
    }

    private final boolean endsSentence(SpanInfo span) {
        String obj = wq.n.L0(span.getText()).toString();
        while (obj.length() > 0 && TRAILING_CLOSERS.contains(Character.valueOf(wq.n.n0(obj)))) {
            obj = wq.n.c0(obj);
        }
        if (obj.length() == 0) {
            return false;
        }
        return SENTENCE_END_PUNCTUATION.contains(Character.valueOf(wq.n.n0(obj)));
    }

    private final k expandToAdjacentSentences(List<SpanInfo> spans, int startIdx, int endIdx, int maxLen) {
        boolean z6 = true;
        boolean z10 = true;
        boolean z11 = true;
        while (true) {
            if (!z6 && !z10) {
                return new k(Integer.valueOf(startIdx), Integer.valueOf(endIdx));
            }
            if ((z11 && z6) || !z10) {
                Integer nextSentenceEnd = nextSentenceEnd(spans, endIdx);
                if (nextSentenceEnd != null && spans.get(nextSentenceEnd.intValue()).getEndExclusive() - spans.get(startIdx).getStart() <= maxLen) {
                    endIdx = nextSentenceEnd.intValue();
                    z11 = !z11;
                } else {
                    z6 = false;
                }
            } else {
                Integer previousSentenceStart = previousSentenceStart(spans, startIdx);
                if (previousSentenceStart != null && spans.get(endIdx).getEndExclusive() - spans.get(previousSentenceStart.intValue()).getStart() <= maxLen) {
                    startIdx = previousSentenceStart.intValue();
                    z11 = !z11;
                } else {
                    z10 = false;
                }
            }
        }
    }

    private final int focusSpanIndex(List<SpanInfo> spans, long offset) {
        Iterator<SpanInfo> it = spans.iterator();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().getStart() == offset) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        Iterator<T> it2 = spans.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            int i13 = i10 + 1;
            if (((SpanInfo) it2.next()).getStart() > offset) {
                break;
            }
            i12 = i10;
            i10 = i13;
        }
        return i12;
    }

    public static /* synthetic */ BookmarkWindow invoke$default(GetBookmarkWindowUseCase getBookmarkWindowUseCase, List list, int i10, long j4, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 400;
        }
        return getBookmarkWindowUseCase.invoke(list, i10, j4, i11);
    }

    private static final List<SpanInfo> invoke$spansOf(HashMap<Integer, List<SpanInfo>> hashMap, GetBookmarkWindowUseCase getBookmarkWindowUseCase, List<String> list, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        List<SpanInfo> list2 = hashMap.get(valueOf);
        if (list2 == null) {
            list2 = getBookmarkWindowUseCase.parseSpans(list.get(i10));
            hashMap.put(valueOf, list2);
        }
        return list2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ho.l, java.lang.Object] */
    private final String joinText(List<SpanInfo> list) {
        return wq.n.L0(o.E0(list, Separators.SP, null, null, new Object(), 30)).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence joinText$lambda$0(SpanInfo spanInfo) {
        spanInfo.getClass();
        return spanInfo.getText();
    }

    private final Integer nextSentenceEnd(List<SpanInfo> spans, int afterIdx) {
        do {
            afterIdx++;
            if (afterIdx >= spans.size()) {
                return null;
            }
        } while (!endsSentence(spans.get(afterIdx)));
        return Integer.valueOf(afterIdx);
    }

    private final List<SpanInfo> parseSpans(String html) {
        SpanInfo spanInfo;
        g B = s0.B(html);
        us.g.z("span[c]");
        e e10 = jo.a.e(v.g0("span[c]"), B);
        e10.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = e10.iterator();
        while (it.hasNext()) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) it.next();
            String d10 = kVar.d("c");
            d10.getClass();
            Long Z = u.Z(d10);
            if (Z != null) {
                long longValue = Z.longValue();
                String a02 = kVar.a0();
                a02.getClass();
                spanInfo = new SpanInfo(longValue, longValue + a02.length(), a02);
            } else {
                spanInfo = null;
            }
            if (spanInfo != null) {
                arrayList.add(spanInfo);
            }
        }
        return arrayList;
    }

    private final Integer previousSentenceStart(List<SpanInfo> spans, int beforeIdx) {
        if (beforeIdx == 0) {
            return null;
        }
        for (int i10 = beforeIdx - 1; i10 > 0; i10--) {
            if (endsSentence(spans.get(i10 - 1))) {
                return Integer.valueOf(i10);
            }
        }
        return 0;
    }

    private final int sentenceEndIndex(List<SpanInfo> spans, int fromIdx) {
        while (fromIdx < spans.size() - 1) {
            if (endsSentence(spans.get(fromIdx))) {
                return fromIdx;
            }
            fromIdx++;
        }
        return spans.size() - 1;
    }

    private final int sentenceStartIndex(List<SpanInfo> spans, int fromIdx) {
        while (fromIdx > 0) {
            if (endsSentence(spans.get(fromIdx - 1))) {
                return fromIdx;
            }
            fromIdx--;
        }
        return 0;
    }

    private final k trimAroundFocus(List<SpanInfo> spans, int startIdx, int endIdx, int focusIdx, int maxLen) {
        long j4;
        while (true) {
            j4 = maxLen;
            if (spans.get(endIdx).getEndExclusive() - spans.get(startIdx).getStart() <= j4 || endIdx <= focusIdx) {
                break;
            }
            endIdx--;
        }
        while (spans.get(endIdx).getEndExclusive() - spans.get(startIdx).getStart() > j4 && startIdx < focusIdx) {
            startIdx++;
        }
        return new k(Integer.valueOf(startIdx), Integer.valueOf(endIdx));
    }

    private final BookmarkWindow windowOver(List<SpanInfo> spans, long focusOffset, int maxLen) {
        List<SpanInfo> list;
        int intValue;
        int intValue2;
        int focusSpanIndex = focusSpanIndex(spans, focusOffset);
        int sentenceStartIndex = sentenceStartIndex(spans, focusSpanIndex);
        int sentenceEndIndex = sentenceEndIndex(spans, focusSpanIndex);
        if (spans.get(sentenceEndIndex).getEndExclusive() - spans.get(sentenceStartIndex).getStart() > maxLen) {
            list = spans;
            k trimAroundFocus = trimAroundFocus(list, sentenceStartIndex, sentenceEndIndex, focusSpanIndex, maxLen);
            intValue = ((Number) trimAroundFocus.f31600a).intValue();
            intValue2 = ((Number) trimAroundFocus.f31601b).intValue();
        } else {
            list = spans;
            k expandToAdjacentSentences = expandToAdjacentSentences(list, sentenceStartIndex, sentenceEndIndex, maxLen);
            intValue = ((Number) expandToAdjacentSentences.f31600a).intValue();
            intValue2 = ((Number) expandToAdjacentSentences.f31601b).intValue();
        }
        List<SpanInfo> list2 = list;
        return new BookmarkWindow(list2.get(intValue).getStart(), list2.get(intValue2).getEndExclusive(), joinText(list2.subList(intValue, intValue2 + 1)));
    }

    public final BookmarkWindow invoke(List<String> elements, int focusElementIndex, long focusOffset, int maxLen) {
        boolean z6;
        elements.getClass();
        if (elements.isEmpty()) {
            return null;
        }
        int m10 = l.m(focusElementIndex, 0, elements.size() - 1);
        int i10 = maxLen * 3;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(invoke$spansOf(hashMap, this, elements, m10));
        int i11 = m10;
        do {
            long j4 = i10;
            if (charSpan(arrayList) >= j4) {
                break;
            }
            if (m10 > 0) {
                m10--;
                arrayList.addAll(0, invoke$spansOf(hashMap, this, elements, m10));
                z6 = true;
            } else {
                z6 = false;
            }
            if (i11 < elements.size() - 1 && charSpan(arrayList) < j4) {
                i11++;
                arrayList.addAll(invoke$spansOf(hashMap, this, elements, i11));
                z6 = true;
            }
        } while (z6);
        if (arrayList.isEmpty()) {
            return null;
        }
        return windowOver(arrayList, focusOffset, maxLen);
    }

    public static /* synthetic */ BookmarkWindow invoke$default(GetBookmarkWindowUseCase getBookmarkWindowUseCase, String str, long j4, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 400;
        }
        return getBookmarkWindowUseCase.invoke(str, j4, i10);
    }

    public final BookmarkWindow invoke(String html, long focusOffset, int maxLen) {
        html.getClass();
        return invoke(f.H(html), 0, focusOffset, maxLen);
    }
}
