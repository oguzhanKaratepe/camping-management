import * as React from 'react';
import { useState, useEffect } from "react";
import { DataGrid, GridCellEditStopReasons } from '@mui/x-data-grid';
import {
  randomCity,
  randomCreatedDate,
  randomTraderName,
  randomUpdatedDate,
} from '@mui/x-data-grid-generator';
import { getVisitors } from '../services/VisitorService';


const columns = [
  { field: 'name', headerName: 'Name', width: 180, editable: false },
  { field: 'identity', headerName: 'Identity', type: 'String', width: 180, editable: false },
  { field: 'gender', headerName: 'Gender', type: 'String', editable: false },
  { field: 'registrationTime', headerName: 'Registration Time', type: 'dateTime', width: 220, editable: true },
];

function VisitorPage() {
  const [visitors, setVisitors] = useState(null);
  const [dataLoading, setDataLoading] = useState(true);
  const [errorMessage, setErrorMessage] = useState(null);

  useEffect(() => {
    async function getVisitorsData() {
      getVisitors().then((res) => setVisitors(res.data)).catch(error => {
        setErrorMessage(error.message);
        console.error('There was an error!', error);
      });
      setDataLoading(false);
    }
    if (dataLoading) {
      getVisitorsData();
    }
  }, []);
  return (
    <div style={{ height: 300, width: '100%' }}>
      <DataGrid
        rows={visitors}
        columns={columns}
        experimentalFeatures={{ newEditingApi: true }}
        onCellEditStop={(params, event) => {
          if (params.reason === GridCellEditStopReasons.cellFocusOut) {
            event.defaultMuiPrevented = true;
          }
        }}
      />
    </div>
  );
}


export default VisitorPage;