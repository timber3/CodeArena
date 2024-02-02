//받은 알림함 리스트

import "../css/ProblemListItem.css"

export default function ReceiveListItem(probs) {

  return(
    <tr className={((probs.index%2)===0) ? 'even ' : ''} >
      <th className="p-1">{probs.receiveItem.receiveId}</th>
      <th className="p-1">{probs.receiveItem.receiveId}</th>
      {/* 처리여부는 드롭다운박스 */}
      {/* <th> 
        <select value={} onChange={} className="select select-sm select-bordered w-28" >
          <option>처리중</option>
          <option>승인</option>
          <option>거절</option>
        </select>
      </th> */}
      <th className="p-1">{probs.receiveItem.receiveId}</th>
      <th className="p-1">{probs.receiveItem.receiveId}</th>
      <th className="p-1">{probs.receiveItem.receiveId}</th>
    </tr>
  )
}